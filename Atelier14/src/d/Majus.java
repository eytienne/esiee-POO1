package d;

public class Majus {

	public static String capitalize(String s) {
		return Character.toUpperCase(s.charAt(0))
				+ s.substring(1, s.length()).toLowerCase();
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Fournis un argument !");
		} else {
			System.out.println(Majus.capitalize(args[0]));
		}
	}
}
