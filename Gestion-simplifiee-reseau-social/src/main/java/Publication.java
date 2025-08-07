public class Publication {
    private String id;
    private String titre;
    private Utilisateurs auteur;
    private String description;

    public Utilisateurs getAuteur() {
        return auteur;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuteur(Utilisateurs auteur) {
        this.auteur = auteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Publication(String id ,String titre, Utilisateurs auteur, String description) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
    }
}
