package Devoir;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publication {
    private Utilisateur auteur ;
    private  String titre;
    private String contenu;
    private LocalDateTime datePublication ;
    private List<Commentaire> commentaires;

    public void setDatePublication(LocalDateTime datePublication) {
        this.datePublication = datePublication;
    }

    public Publication(Utilisateur auteur, String contenu, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.contenu = contenu;
        this.datePublication = LocalDateTime.now();
        this.commentaires = new ArrayList<>();

    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDateTime getDatePublication() {
        return datePublication;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication.atStartOfDay();
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
