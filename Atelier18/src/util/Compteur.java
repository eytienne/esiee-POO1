package util;

public class Compteur {

	private int cpt;
	private static int nbcounter = 0;

	public Compteur() {
		Compteur.nbcounter++;
		this.init();
	}

	@Override
	protected void finalize() throws Throwable {
		Compteur.nbcounter--;
		super.finalize();
	}
	
	public Compteur(int value) {
		this();
		this.init(value);
	}

	public Compteur(Compteur c) {
		this();
		this.init(c);
	}

	public void init() {
		this.cpt = 0;
	}

	public void init(int value) {
		this.cpt = value;
	}

	public void init(Compteur c) {
		this.cpt = c.get();
	}

	public Compteur increment() {
		this.cpt++;
		return this;
	}

	public int get() {
		return cpt;
	}

	@Override
	public String toString() {
		return "value:" + this.get();
	}

	public void affiche() {
		System.out.println(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Compteur c = (Compteur) obj;
		if (this.get() != c.get())
			return false;
		return true;
	}

	public Compteur add(Compteur c3) {
		this.cpt += c3.get();
		return this;
	}

	public static int lirenbcompteur() {
		return nbcounter;
	}

}
