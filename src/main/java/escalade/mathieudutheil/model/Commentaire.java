package escalade.mathieudutheil.model;

import javax.persistence.*;

@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "commentaire")
    private String commentaire;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "grimpeur_id")
    private Grimpeur grimpeur;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "site_de_grimpe_id")
    private SiteDeGrimpe siteDeGrimpe;

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Grimpeur getGrimpeur() {
        return grimpeur;
    }

    public void setGrimpeur(Grimpeur grimpeur) {
        this.grimpeur = grimpeur;
    }

    public SiteDeGrimpe getSiteDeGrimpe() {
        return siteDeGrimpe;
    }

    public void setSiteDeGrimpe(SiteDeGrimpe siteDeGrimpe) {
        this.siteDeGrimpe = siteDeGrimpe;
    }
}