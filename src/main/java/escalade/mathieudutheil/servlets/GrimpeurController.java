package escalade.mathieudutheil.servlets;

import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.model.Grimpeur;
import escalade.mathieudutheil.service.GrimpeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GrimpeurController {
    @Autowired
    private GrimpeurService grimpeurService;

    @GetMapping("/grimpeur")
    public String afficherGrimpeur ( Model model) {
        Iterable<Grimpeur> listeGrimpeurs = grimpeurService.getGrimpeurs();
        List<Grimpeur> result = new ArrayList<>();
        for (Grimpeur c : listeGrimpeurs) {
            result.add(c);
        }


       model.addAttribute("listeGrimpeurs", result);
        return "grimpeur.html";
    }

}
