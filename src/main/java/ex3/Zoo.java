package ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo {

	private String nom;

	// HashMap<String, Zone> zones = new HashMap<>();
	List<Zone> zones = new ArrayList<>();

	public Zoo(String nom) {

		this.nom = nom;

		zones.add(new ZoneCarnivore());
		zones.add(new Aquarium());
		zones.add(new SavaneAfricaine());
		zones.add(new FermeReptile());

	}

	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.MAMMIFERE) && animal.getComportement().equals(ComportementAnimal.CARNIVORE)) {
			zones.get(0).addAnimal(animal);
		} else if (animal.getType().equals(Type.MAMMIFERE) && animal.getComportement().equals(ComportementAnimal.HERBIVORE)) {
			zones.get(3).addAnimal(animal);
		} else if (animal.getType().equals(Type.REPTILE)) {
			zones.get(4).addAnimal(animal);
		} else if (animal.getType().equals(Type.POISSON)) {
			zones.get(2).addAnimal(animal);
		}

	}

	public void afficherListeAnimaux() {
		
		for (Zone zone: zones) {
			zone.afficherListeAnimaux();
		}

	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
