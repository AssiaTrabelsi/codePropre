package ex3;

import java.util.List;

public class Animal {

	protected Type type;
	protected String nom;
	protected ComportementAnimal comportement;

	public Animal(String nom, Type type, ComportementAnimal comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ComportementAnimal getComportement() {
		return comportement;
	}

	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

}
