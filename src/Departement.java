import java.util.Objects;

public class Departement {
    private int id,nbr;
    private String nom;

    public Departement(int id, int nbr, String nom) {
        this.id = id;
        this.nbr = nbr;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nbr == that.nbr && Objects.equals(nom, that.nom);
    }

    @Override
    public String toString() {
        return "Departremnt{" +
                "id=" + id +
                ", nbr=" + nbr +
                ", nom='" + nom + '\'' +
                '}';
    }
}
