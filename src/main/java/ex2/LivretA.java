package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {

		this.solde = solde + solde * tauxRemuneration / 100;

	}

	public void debiterMontant(double montant) {

		if (this.solde - montant > 0) {
			this.solde = solde - montant;

		}
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
