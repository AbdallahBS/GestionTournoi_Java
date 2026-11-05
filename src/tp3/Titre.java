
package tp3;

public class Titre {

    private String nom;

    public Titre(String nom) throws JoueurInvalideException {

        if (nom == null || nom.trim().isEmpty()) {
            throw new JoueurInvalideException("Nom du titre invalide !");
        }

        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Titre : " + nom;
    }
}