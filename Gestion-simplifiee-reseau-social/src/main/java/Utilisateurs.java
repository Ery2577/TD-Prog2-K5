import java.util.Date;

public class Utilisateurs {
    private String id;
    private String nom;
    private String email;
    private Date dateDeCreation;

    public Utilisateurs(Date dateDeCreation, String email, String id, String nom) {
        this.dateDeCreation = dateDeCreation;
        this.email = email;
        this.id = id;
        this.nom = nom;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
