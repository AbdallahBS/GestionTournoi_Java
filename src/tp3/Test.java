
package tp3;

public class Test {

    public static void main(String[] args) {

        try {

            // Creation d'une equipe
            Equipe e1 = new Equipe();

            // Creation des joueurs
            Joueur j1 = new Joueur(
                    "Ahmed Ben Ali", 22, 1.80, 75, 10, Role.Attaque
            );

            Joueur j2 = new Joueur(
                    "Mohamed Salah", 24, 1.85, 80, 15, Role.Gardien
            );

            Joueur j3 = new Joueur(
                    "Ali Mansour", 21, 1.78, 70, 12, Role.Defense
            );

            // Ajout des joueurs
            e1.ajouterJoueur(j1);
            e1.ajouterJoueur(j2);
            e1.ajouterJoueur(j3);

            // Creation des titres
            Titre t1 = new Titre("Championnat national");
            Titre t2 = new Titre("Coupe nationale");

            // Ajout des titres
            e1.ajouterTitre(t1);
            e1.ajouterTitre(t2);

            // Test de afficher()
            System.out.println("AFFICHAGE AVEC afficher()");
            e1.afficher();

            // Test de toString()
            System.out.println("\nAFFICHAGE AVEC toString()");
            System.out.println(e1);

            // Test de getJoueur()
            System.out.println("\nPREMIER JOUEUR :");
            System.out.println(e1.getJoueur(0));

            // Test de getJoueurs()
            System.out.println("\nNOMBRE DE JOUEURS :");
            System.out.println(e1.getJoueurs().size());

        } catch (JoueurInvalideException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}