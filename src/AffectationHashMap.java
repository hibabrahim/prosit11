import java.util.*;

class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
        } else {
            System.out.println("Cet employé est déjà affecté à un département.");
        }
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + ", Département: " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        } else {
            System.out.println("Cet employé ne travaille pas dans ce département.");
        }
    }

    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println("Employé: " + e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println("Département: " + d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(new Comparator<Employe>() {
            public int compare(Employe e1, Employe e2) {
                // Comparaison basée sur l'identifiant de l'employé
                return e1.getIdentifiant() - e2.getIdentifiant();
            }
        });
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}