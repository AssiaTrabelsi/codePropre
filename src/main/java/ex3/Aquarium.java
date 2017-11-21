package ex3;



public class Aquarium extends Zone {

	public double calculerKgsNourritureParJour() {

		return animaux.size() * 0.2;

	}
	
	@Override
	public String getNom() {
		return "Aquarium";
	}

}