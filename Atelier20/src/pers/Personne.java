package pers;

import util.Adresse;

public class Personne {
	private String nom, prenom;
	private int age;
	private Adresse adresse;

	public Personne(String nom, String prenom, int age, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}

	public Personne() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age = i;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return this.nom + " " + this.prenom + " " + this.age;
	}

	public void affiche() {
		System.out.println(this);
	}

}
