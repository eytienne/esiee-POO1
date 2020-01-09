package d;

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

	public static void main(String[] args) {
		Compteur c1 = new Compteur(), c2 = new Compteur();
		System.out.println("before increment : " + c1 + " " + c2);
		c1.increment();
		c2.increment();
		System.out.println("after increment : " + c1 + " " + c2);
	}

}
