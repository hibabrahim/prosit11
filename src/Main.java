
import java.util.*;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        // Création des employés
        Employe employe1 = new Employe(1, 14,"Alice","bb");
        Employe employe2 = new Employe(2, 14,"Bob","bb");
        Employe employe3 = new Employe(3,14, "Charlie","bb");

        // Création des départements
        Departement departement1 = new Departement(1,16,"amm");
        Departement departement2 = new Departement(2,19,"amm");

        // Ajout des employés aux départements
        affectationMap.ajouterEmployeDepartement(employe1, departement1);
        affectationMap.ajouterEmployeDepartement(employe2, departement2);
        affectationMap.ajouterEmployeDepartement(employe3, departement1);

        // Affichage des employés et des départements
        System.out.println("Liste des employés et départements:");
        affectationMap.afficherEmployesEtDepartements();

        // Essai d'ajouter le même employé à deux départements différents
        affectationMap.ajouterEmployeDepartement(employe1, departement2);

        // Affichage des employés et des départements après la tentative
        System.out.println("\nListe des employés et départements après la tentative d'ajout:");
        affectationMap.afficherEmployesEtDepartements();

        // Suppression d'un employé
        affectationMap.supprimerEmploye(employe3);

        // Affichage des employés restants
        System.out.println("\nListe des employés après suppression:");
        affectationMap.afficherEmployes();

        // Vérification de l'existence d'un employé et d'un département
        System.out.println("\nRecherche de l'employé : " + affectationMap.rechercherEmploye(employe2));
        System.out.println("Recherche du département : " + affectationMap.rechercherDepartement(departement2));

        // Tri des employés selon leur identifiant
        TreeMap<Employe, Departement> employesTries = affectationMap.trierMap();
        System.out.println("\nListe des employés triés selon leur identifiant:");
        for (Map.Entry<Employe, Departement> entry : employesTries.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + ", Département: " + entry.getValue());
        }
    }
}