package d;

public class Signe {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("il faut fournir un entier en argument!");
		} else {
			int i = Integer.parseInt(args[0]);
			System.out.println(i > 0 ? "Positif" : i < 0 ? "Négatif" : "Nul");
		}
	}
}
