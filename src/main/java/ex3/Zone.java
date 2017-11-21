package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected List<Animal> animaux = new ArrayList<Animal>();

	public Zone() {
		super();

	}
	
	public abstract String getNom();

	public void addAnimal(Animal animal) {

		animaux.add(animal);
	}

	public void afficherListeAnimaux() {

		// for (Animal animal : animaux)

		for (int i = 0; i < animaux.size(); i++) {

			System.out.println(getNom()+ " - "+ animaux.get(i).getNom());

		}

	}

}
