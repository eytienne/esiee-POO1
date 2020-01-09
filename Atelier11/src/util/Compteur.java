package util;

public class Compteur {

	private int cpt;

	public Compteur() {
		this.init();
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

}
