package d;

public class Perim {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("il faut fournir le rayon en argument!");
		} else {
			double rayon = Double.parseDouble(args[0]);
			System.out.println(2 * Math.PI * rayon);
		}

	}

}
