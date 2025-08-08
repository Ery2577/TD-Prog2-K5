package Devoir.code;

import java.time.LocalDate;

public abstract class Utilisateur {
    protected String id;
    protected String nomUtilisateur;
    protected String email;
    protected LocalDate dateCreation;

    public Utilisateur(String id, String nomUtilisateur, String email) {
        this.id = id;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.dateCreation = LocalDate.now();
    }

    public String getId() { return id; }
    public String getNomUtilisateur() { return nomUtilisateur; }
    public String getEmail() { return email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utilisateur)) return false;
        Utilisateur u = (Utilisateur) o;
        return id.equals(u.id) && nomUtilisateur.equals(u.nomUtilisateur) && email.equals(u.email);
    }
}
