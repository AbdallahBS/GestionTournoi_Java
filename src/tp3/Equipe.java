
package tp3;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipe {

    private ArrayList<Joueur> joueurs;
    private ArrayList<Titre> titres;

    // Constructeur
    public Equipe() {
        joueurs = new ArrayList<Joueur>();
        titres = new ArrayList<Titre>();
    }

    // Ajouter un joueur
    public void ajouterJoueur(Joueur j) {

        if (j != null) {
            joueurs.add(j);
        }
    }

    // Ajouter un titre
    public void ajouterTitre(Titre t) {

        if (t != null) {
            titres.add(t);
        }
    }

    // Recuperer un joueur par son indice
    public Joueur getJoueur(int index) {

        if (index < 0 || index >= joueurs.size()) {
            throw new IndexOutOfBoundsException(
                "Indice du joueur invalide !"
            );
        }

        return joueurs.get(index);
    }

    // Recuperer la liste des joueurs
    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    // Afficher les joueurs avec Iterator
    public void afficherJoueurs() {

        Iterator<Joueur> it = joueurs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Afficher les titres avec Iterator
    public void afficherTitres() {

        Iterator<Titre> it = titres.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Afficher toutes les donnees
    public void afficher() {

        System.out.println("===== JOUEURS =====");
        afficherJoueurs();

        System.out.println("===== TITRES =====");
        afficherTitres();
    }

    // Redefinition de toString avec StringBuffer et For Each
    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb.append("===== EQUIPE =====\n");

        sb.append("Joueurs :\n");

        for (Joueur j : joueurs) {
            sb.append(j.toString()).append("\n");
        }

        sb.append("Titres :\n");

        for (Titre t : titres) {
            sb.append(t.toString()).append("\n");
        }

        return sb.toString();
    }
}