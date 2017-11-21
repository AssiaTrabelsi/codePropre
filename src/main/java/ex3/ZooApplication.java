package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle", Type.MAMMIFERE, ComportementAnimal.HERBIVORE));

		zoo.addAnimal(new Animal("Zèbre", Type.MAMMIFERE, ComportementAnimal.HERBIVORE));

		zoo.addAnimal(new Animal("Lion", Type.MAMMIFERE, ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", Type.MAMMIFERE, ComportementAnimal.CARNIVORE));

		
		zoo.afficherListeAnimaux();
		
		/*
		 * zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		 * zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		 * zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		 * zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
		 */

	}

}
