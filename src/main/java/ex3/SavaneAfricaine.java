package ex3;

public class SavaneAfricaine extends Zone {


	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}
	
	@Override
	public String getNom() {
		return "Savane africaine";
	}
}
