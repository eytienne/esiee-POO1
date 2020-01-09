package d;

public class Factorielle {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("il faut fournir un entier en argument!");
		} else {
			int i = Integer.parseInt(args[0]);
			if (i < 0) {
				throw new RuntimeException(
						"donne un entier positif ou nul stp !");
			} else {
				int prod = 1;
				for (int j = 1; j <= i; j++) {
					prod *= j;
				}
				System.out.println(prod);
			}
		}
	}

}
