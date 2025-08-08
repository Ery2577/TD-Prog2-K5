package Devoir.code;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private Utilisateur auteur;
    private String contenu;
    private List<Commentaire> commentaires;

    public Publication(Utilisateur auteur, String contenu) {
        this.auteur = auteur;
        this.contenu = contenu;
        this.commentaires = new ArrayList<>();
    }

    public String getContenu() {
        return contenu;
    }

    public void ajouterCommentaire(Commentaire commentaire){
    commentaires.add(commentaire);
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}
