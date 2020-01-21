package util;

public class Compteur {

	private int cpt;

	public Compteur() {

	}

	public Compteur(int value) {
		this.init(value);
	}

	public Compteur(Compteur c) {
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

	public void increment() {
		this.cpt++;
	}

	public int get() {
		return cpt;
	}

	@Override
	public String toString() {
		return "" + this.get();
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		if(obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Compteur c = (Compteur) obj;
		if (this.get() != c.get())
			return false;
		return true;
	}

}
