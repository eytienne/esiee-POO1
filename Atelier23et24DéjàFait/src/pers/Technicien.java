package pers;

import util.Adresse;

public class Technicien extends Employe {
	private String specialite;

	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, int age, Adresse adresse, double salaire, String spécialite) {
		super(nom, prenom, age, adresse, salaire);
		this.specialite = spécialite;
	}

	public Technicien(String nom, String prenom, int age, double salaire, String spécialite) {
		super(nom, prenom, age, null, salaire);
		this.specialite = spécialite;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String spécialite) {
		this.specialite = spécialite;
	}

	@Override
	public void augmentation(float pc) {
		super.augmentation(pc + (float) (50 / getSalaire() * 100));
	}

	@Override
	public String toString() {
		return super.toString() + ", spécialité : " + getSpecialite();
	}

}
