package Devoir;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Commentaire {
    private Utilisateur auteur ;
    private String contenu;
    private LocalDateTime date;
    public Utilisateur getAuteur() {
        return auteur;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(LocalDate date) {
        this.date = date.atStartOfDay();
    }



}
