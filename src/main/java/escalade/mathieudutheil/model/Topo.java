package escalade.mathieudutheil.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "topo")
public class Topo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "lieu")
    private String lieu;

    @Column(name = "date_de_parution")
    private Date dateDeParution;

    @Column(name = "disponible")
    private Boolean disponible;

    @OneToMany(
            mappedBy = "topo"
    )
    private List<Reservation> reservations = new ArrayList<>();

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
    private Grimpeur siteDeGrimpe;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDateDeParution() {
        return dateDeParution;
    }

    public void setDateDeParution(Date dateDeParution) {
        this.dateDeParution = dateDeParution;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Grimpeur getGrimpeur() {
        return grimpeur;
    }

    public void setGrimpeur(Grimpeur grimpeur) {
        this.grimpeur = grimpeur;
    }

    public Grimpeur getSiteDeGrimpe() {
        return siteDeGrimpe;
    }

    public void setSiteDeGrimpe(Grimpeur siteDeGrimpe) {
        this.siteDeGrimpe = siteDeGrimpe;
    }
}