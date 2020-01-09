package util;

public class Compteur {

	private int cpt = 0;

	public Compteur() {

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

}
