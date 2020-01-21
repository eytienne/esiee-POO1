package d;

public class Compteur implements Comparable<Compteur>{
	
	private int cpt;
	private static int nbcounter = 0; // variable de classe

	public static int lirenbcounter() // méthode de classe
	{
		return nbcounter;
	}

	public Compteur() // constructeur sans argument
	{
		cpt = 0;
		nbcounter++;
	}

	public Compteur(int a) // constructeur avec argument
	{
		cpt = a;
		nbcounter++;
	}

	public Compteur(Compteur c) // constructeur avec argument
	{
		cpt = c.cpt;
// init(c);
// this(c.cpt);
		nbcounter++;
	}

	public Compteur increment() {
		cpt++;
		return this;
	}

	public void affiche() {
		System.out.println("valeur: " + cpt);
	}

	public int lirecount() {
		return cpt;
	}

	public void init() {
		cpt = 0;
	}

	public void init(int a) {
		cpt = a;
	}

	public void init(Compteur c) {
//cpt=c.lirecount();
		cpt = c.cpt;
	}

	public Compteur add(Compteur c) {
		cpt += c.cpt;
		return this;
	}

	public String toString() {
		return "" + cpt;
	}

	@Override
	public int compareTo(Compteur o) {
		return this.cpt - o.cpt;
	}
}
