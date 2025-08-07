package Devoir;

import java.time.LocalDate;

public class Utilisateur {
    private String id;
    private String nom;
    private String email;
    private LocalDate dateCreation ;
    private Type type ;

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public Type getType() {
        return type;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setType(Type type) {
        this.type = type;
    }

}



