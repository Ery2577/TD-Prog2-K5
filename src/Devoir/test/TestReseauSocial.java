// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
// import reseausocial.*;
// 
// public class TestReseauSocial {
// 
//     @Test
//     public void testCreationPublication() {
//         Utilisateur u = new UtilisateurStandard("1", "alice", "alice@mail.com");
//         Publication p = new Publication(u, "Hello world!");
//         assertEquals("Hello world!", p.getContenu());
//     }
// 
//     @Test
//     public void testAjoutCommentaire() {
//         Utilisateur u = new UtilisateurStandard("1", "alice", "alice@mail.com");
//         Publication p = new Publication(u, "Post");
//         Commentaire c = new Commentaire(u, "Commentaire");
//         p.ajouterCommentaire(c);
//         assertEquals(1, p.getCommentaires().size());
//     }
// 
//     @Test
//     public void testSuppressionPublication() {
//         Administrateur admin = new Administrateur("0", "admin", "admin@mail.com");
//         GroupeUtilisateur groupe = new GroupeUtilisateur(admin);
//         Publication p = new Publication(admin, "Post à supprimer");
//         groupe.ajouterPublication(p);
//         groupe.supprimerPublication(p, admin);
//         assertEquals(0, groupe.getNombrePublications());
//     }
// 
//     @Test
//     public void testSuppressionCommentaire() {
//         Utilisateur u = new UtilisateurStandard("1", "alice", "alice@mail.com");
//         Publication p = new Publication(u, "Post");
//         Commentaire c = new Commentaire(u, "Commentaire");
//         p.ajouterCommentaire(c);
//         p.supprimerCommentaire(c);
//         assertEquals(0, p.getCommentaires().size());
//     }
// 
//     @Test
//     public void testSuppressionUtilisateur() {
//         Administrateur admin = new Administrateur("0", "admin", "admin@mail.com");
//         GroupeUtilisateur groupe = new GroupeUtilisateur(admin);
//         UtilisateurStandard u = new UtilisateurStandard("1", "user", "user@mail.com");
//         groupe.ajouterMembre(u);
//         groupe.supprimerUtilisateur(u, admin);
//         assertFalse(groupe.contientUtilisateur(u));
//     }
// }
// 