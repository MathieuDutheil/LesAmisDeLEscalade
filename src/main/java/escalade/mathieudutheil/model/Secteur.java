package escalade.mathieudutheil.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "secteur")
public class Secteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "temps_de_marche")
    private String tempsDeMarche;

    @Column(name = "altitude")
    private String altitude;

    @OneToMany(
            cascade = CascadeType.ALL, //Si je supprime le Secteur, cela supprimera les Voies associés, si je mets à jour pareil
            orphanRemoval = true, //Evite qu'en base de de données il existe des Voies alors que le Secteur a été supprimé
            fetch = FetchType.EAGER // lorsqu'on va récupérer les Secteurs toutes les voies seront récupérés
    )
    @JoinColumn(name = "secteur_id")
    private List<Voie> voies = new ArrayList<>();

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

    public String getTempsDeMarche() {
        return tempsDeMarche;
    }

    public void setTempsDeMarche(String tempsDeMarche) {
        this.tempsDeMarche = tempsDeMarche;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }
}