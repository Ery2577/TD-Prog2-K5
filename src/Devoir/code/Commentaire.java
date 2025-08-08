package Devoir.code;

public class Commentaire {
    private Utilisateur auteur;
    private String contenu;

    public Commentaire(Utilisateur auteur, String contenu){
        this.auteur= auteur;
    }

    public String getContenu(){
        return contenu;
    }

    public Utilisateur getAuteur(){
        return auteur;
    }
}
