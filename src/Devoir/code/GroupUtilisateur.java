package Devoir.code;

import java.util.ArrayList;
import java.util.List;

public class GroupUtilisateur {
    private List<Utilisateur> membre;
    private List<Publication> publications;
    private Administrateur administrateur;

    public GroupUtilisateur(Administrateur admin){
        this.administrateur = admin;
        this.membre = new ArrayList<>();
        this.publications = new ArrayList<>();
        membre.add(admin);
    }

    public void ajouterCommentaire(Utilisateur){
        membre.add(Utilisateur);
    }

    public boolean contientUtilisateur()

    

}
