package tp3;
 
public class Joueur {

    // Attributs
    private String nomPrenom;
    private int age;
    private double taille;
    private double poids;
    private int nombreMatchs;
    private Role role;

    // Constructeur
    public Joueur(String nomPrenom, int age, double taille,
                  double poids, int nombreMatchs, Role role)
                  throws JoueurInvalideException {

        if (nomPrenom == null || nomPrenom.trim().isEmpty()) {
            throw new JoueurInvalideException("Nom invalide !");
        }

        if (age <= 0 || taille <= 0 || poids <= 0 || nombreMatchs <= 0) {
            throw new JoueurInvalideException(
                "Les valeurs numeriques doivent etre positives !"
            );
        }

        if (role == null) {
            throw new JoueurInvalideException("Role invalide !");
        }

        this.nomPrenom = nomPrenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.nombreMatchs = nombreMatchs;
        this.role = role;
    }

    // Getters
    public String getNomPrenom() {
        return nomPrenom;
    }

    public int getAge() {
        return age;
    }

    public double getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    public int getNombreMatchs() {
        return nombreMatchs;
    }

    public Role getRole() {
        return role;
    }

    // toString
    @Override
    public String toString() {
        return "Joueur{" +
                "nomPrenom='" + nomPrenom + '\'' +
                ", age=" + age +
                ", taille=" + taille +
                ", poids=" + poids +
                ", nombreMatchs=" + nombreMatchs +
                ", role=" + role +
                '}';
    }
}