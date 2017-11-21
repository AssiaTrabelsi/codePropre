package ex3;

import java.util.List;

public class FermeReptile extends Zone {

	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.1;
	}
	
	@Override
	public String getNom() {
		return "Ferme reptile";
	}
}
