package escalade.mathieudutheil.forms;

import escalade.mathieudutheil.model.Grimpeur;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CreationGrimpeurForm {
    private static final String CHAMP_NOM = "nomGrimpeur";
    private static final String CHAMP_PRENOM = "prenomGrimpeur";
    private static final String CHAMP_EMAIL = "emailGrimpeur";
    private static final String CHAMP_MOT_DE_PASSE = "motDePasseGrimpeur";
    private static final String CHAMP_CONFIRMATION_MOT_DE_PASSE = "confirmationMotDePasseGrimpeur";
    private static final String CHAMP_TELEPHONE = "telephoneGrimpeur";
    private static final String CHAMP_CIVILITE = "civiliteGrimpeur";
    //TODO rajouter boolean MEMBRE_ASSOCIATION plus tard

    private String resultat;
    private Map<String, String> erreurs = new HashMap<String, String>();

    //Getters pour resultat et erreurs ci-dessus
    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public String getResultat() {
        return resultat;
    }

    public Grimpeur creerGrimpeur(HttpServletRequest request) {
        String civilite = Utilities.getValeurChamp(request, CHAMP_CIVILITE);
        String nom = Utilities.getValeurChamp(request, CHAMP_NOM);
        String prenom = Utilities.getValeurChamp(request, CHAMP_PRENOM);
        String email = Utilities.getValeurChamp(request, CHAMP_EMAIL);
        String motDePasse = Utilities.getValeurChamp(request, CHAMP_MOT_DE_PASSE);
        String confirmationMotDePasse = Utilities.getValeurChamp(request, CHAMP_CONFIRMATION_MOT_DE_PASSE);
        String telephone = Utilities.getValeurChamp(request, CHAMP_TELEPHONE);

        //TODO rajouter boolean MEMBRE_ASSOCIATION plus tard

        Grimpeur grimpeur = new Grimpeur();
        grimpeur.setMembreAssociation(false);



        try {
            validationNom(nom);
        } catch (Exception e) {
            setErreur(CHAMP_NOM, e.getMessage());
        }
        grimpeur.setNom(nom);

        try {
            validationPrenom(prenom);
        } catch (Exception e) {
            setErreur(CHAMP_PRENOM, e.getMessage());
        }
        grimpeur.setPrenom(prenom);

        try {
            validationEmail(email);
        } catch (Exception e) {
            setErreur(CHAMP_EMAIL, e.getMessage());
        }
        grimpeur.setEmail(email);

        try {
            validationMotsDePasse(motDePasse, confirmationMotDePasse);
        } catch (Exception e) {
            setErreur(CHAMP_MOT_DE_PASSE, e.getMessage());
            setErreur(CHAMP_CONFIRMATION_MOT_DE_PASSE, null);
        }
        grimpeur.setMotDePasse(motDePasse);
        grimpeur.setConfirmationMotDePasse(confirmationMotDePasse);

        try {
            validationTelephone(telephone);
        } catch (Exception e) {
            setErreur(CHAMP_TELEPHONE, e.getMessage());
        }
        grimpeur.setTelephone(telephone);

        if (erreurs.isEmpty()) {
            resultat = "Succès de la création du client.";
        } else {
            resultat = "Échec de la création du client.";
        }

        return grimpeur;

    }


    private void validationNom(String nom) throws Exception {
        if (nom != null) {
            if (nom.length() < 2) {
                throw new Exception("Le nom d'utilisateur doit contenir au moins 2 caractères.");
            }
        } else {
            throw new Exception("Merci d'entrer un nom de grimpeur.");
        }
    }

    private void validationPrenom(String prenom) throws Exception {
        if (prenom != null) {
            if (prenom.length() < 2) {
                throw new Exception("Le prénom d'utilisateur doit contenir au moins 2 caractères.");
            }
        } else {
            throw new Exception("Merci d'entrer un prénom de grimpeur.");
        }
    }

    private void validationEmail(String email) throws Exception {
        if (email != null) {
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new Exception("Merci de saisir une adresse mail valide.");
            }
        } else {
            throw new Exception("Merci d'entrer un email pour le grimpeur.");
        }
    }

    private void validationMotsDePasse(String motDePasse, String confirmationMotDePasse) throws Exception {
        if (motDePasse != null && confirmationMotDePasse != null) {
            if (!motDePasse.equals(confirmationMotDePasse)) {
                throw new Exception("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
            } else if (motDePasse.length() < 6) {
                throw new Exception("Les mots de passe doivent contenir au moins 6 caractères.");
            }
        } else {
            throw new Exception("Merci de saisir et confirmer votre mot de passe.");
        }
    }


    private void validationTelephone(String telephone) throws Exception {
        if (telephone != null) {
            if (!telephone.matches("^\\d+$")) {
                throw new Exception("Le numéro de téléphone doit uniquement contenir des chiffres.");
            } else if (telephone.length() < 4) {
                throw new Exception("Le numéro de téléphone doit contenir au moins 4 chiffres.");
            }
        } else {
            throw new Exception("Merci d'entrer un numéro de téléphone.");
        }
    }


    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur(String champ, String message) {
        erreurs.put(champ, message);
    }


}