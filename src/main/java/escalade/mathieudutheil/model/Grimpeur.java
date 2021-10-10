package escalade.mathieudutheil.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grimpeur")
public class Grimpeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "mot_de_passe")
    private String motDePasse;

    @Transient
    private String confirmationMotDePasse;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "membre_association")
    private Boolean membreAssociation;


    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "civilite_id")
    private Civilite civilite;


    @OneToMany(
            mappedBy = "grimpeur"
    )
    private List<Commentaire> commentaires = new ArrayList<>();


    @OneToMany(
            mappedBy = "grimpeur"
    )
    private List<Reservation> reservations = new ArrayList<>();

    @OneToMany(
            mappedBy = "grimpeur"
    )
    private List<Topo> topos = new ArrayList<>();


    @OneToMany(
            mappedBy = "grimpeur"
    )
    private List<SiteDeGrimpe> siteDeGrimpes = new ArrayList<>();


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getMembreAssociation() {
        return membreAssociation;
    }

    public void setMembreAssociation(Boolean membreAssociation) {
        this.membreAssociation = membreAssociation;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<Topo> getTopos() {
        return topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getConfirmationMotDePasse() {
        return confirmationMotDePasse;
    }

    public void setConfirmationMotDePasse(String confirmationMotDePasse) {
        this.confirmationMotDePasse = confirmationMotDePasse;
    }

    public List<SiteDeGrimpe> getSiteDeGrimpes() {
        return siteDeGrimpes;
    }

    public void setSiteDeGrimpes(List<SiteDeGrimpe> siteDeGrimpes) {
        this.siteDeGrimpes = siteDeGrimpes;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

}