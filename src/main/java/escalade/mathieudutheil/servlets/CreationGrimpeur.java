package escalade.mathieudutheil.servlets;

import escalade.mathieudutheil.forms.CreationGrimpeurForm;
import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.model.Grimpeur;
import escalade.mathieudutheil.service.CiviliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//@Configurable
//@WebServlet(urlPatterns = "/creationGrimpeur")
@Controller
public class CreationGrimpeur extends HttpServlet {
    private static final String ATTRIBUTE_GRIMPEUR = "grimpeur";
    public static final String ATTRIBUTE_FORM = "form";

    public static final String VUE_SUCCES = "/WEB-INF/afficherGrimpeur.jsp";
    public static final String VUE_FORM = "creerGrimpeur.html";

    @Autowired
    private CiviliteService civiliteService;

   /* @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        WebApplicationContext appctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        civiliteService = ((CiviliteService) appctx.getBean("civiliteService"));

        //ApplicationContext ac = (ApplicationContext) config.getServletContext().getAttribute("applicationContext.xml");
    }*/

    public CreationGrimpeur() {

    }

    @GetMapping("/creationGrimpeur")
    public String  afficherFormulaireCreationGrimpeur(Model model) {
        // À la réception d'une requête GET, simple affichage du formulaire
        Iterable<Civilite> listeCivilites = civiliteService.getCivilites();
        List<Civilite> result = new ArrayList<>();
        for (Civilite c : listeCivilites) {
            result.add(c);
        }
        model.addAttribute("listeCivilites", result );
        //request.setAttribute("listeCivilites", result);

        // Iterable<Civilite> listeCivilites = civiliteService.getCivilites();
        // request.setAttribute("listeCivilites", listeCivilites);
        return VUE_FORM;
        //this.getServletContext().getRequestDispatcher(VUE_FORM).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CreationGrimpeurForm form = new CreationGrimpeurForm();
        Grimpeur grimpeur = form.creerGrimpeur(request);


        request.setAttribute(ATTRIBUTE_GRIMPEUR, grimpeur);
        request.setAttribute(ATTRIBUTE_FORM, form);

        if (form.getErreurs().isEmpty()) {
            /* Si aucune erreur, alors affichage de la fiche récapitulative */
            this.getServletContext().getRequestDispatcher(VUE_SUCCES).forward(request, response);
        } else {
            /* Sinon, ré-affichage du formulaire de création avec les erreurs */
            this.getServletContext().getRequestDispatcher(VUE_FORM).forward(request, response);
        }
    }


}