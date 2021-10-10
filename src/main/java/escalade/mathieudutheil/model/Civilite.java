package escalade.mathieudutheil.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "civilite")
public class Civilite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "civilite")
    private String civilite;

    @OneToMany(
            mappedBy = "civilite"
    )
    private List<Grimpeur> grimpeurs = new ArrayList<>();


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public List<Grimpeur> getGrimpeurs() {
        return grimpeurs;
    }

    public void setGrimpeurs(List<Grimpeur> grimpeurs) {
        this.grimpeurs = grimpeurs;
    }
}