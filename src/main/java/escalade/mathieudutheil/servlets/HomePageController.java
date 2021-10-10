package escalade.mathieudutheil.servlets;

import org.springframework.web.bind.annotation.GetMapping;

public class HomePageController {

    @GetMapping("/home")
    public String homePageAffichage() {


        return "homePage.html";
    }



}
