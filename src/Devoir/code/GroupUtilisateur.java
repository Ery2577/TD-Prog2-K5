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

     public void ajouterMembre(Utilisateur user){
        membre.add(user);
    }

    public boolean contientUtilisateur(Utilisateur user){
        return membre.contains(user);
    }

    public void ajouterPublication(Publication pub){
        publications.add(pub);
    }

    public void supprimerPublication(Publication pub, Utilisateur user){
        if (user instanceof Moderateur){
            publications.remove(pub);
        }
    }

    public List<Publication> chercherParMotCle(String motCle){
        List<Publication> resultats = new ArrayList<>();
        for (Publication pub : publications){
            if (pub.getContenu().toLowerCase().contains(motCle.toLowerCase())){
                resultats.add(pub);
            }
        }
        return resultats;
    }


    public int getNombrePublication(){
        return publications.size();
    }

    public void supprimerUtilisateur (Utilisateur cible, Utilisateur demandeur){
        if (demandeur instanceof Administrateur){
            membre.remove(cible);
        }
    }

}