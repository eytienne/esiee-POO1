package pers;

import util.Adresse;

public class Employe extends Personne {
	private double salaire;

	public Employe(String nom, String prenom, int age, Adresse adresse, double salaire) {
		super(nom, prenom, age, adresse);
		this.salaire = salaire;
	}

	public Employe(String nom, String prenom, int age, double salaire) {
		this(nom, prenom, age, null, salaire);
	}

	public Employe() {
		super();
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	protected double getSalaire() {
		return this.salaire;
	}

	@Override
	public String toString() {
		return super.toString() + ", salaire : " + getSalaire();
	}

	public void augmentation(float pc) {
		this.salaire *= 1 + (pc / 100);
	}

}
