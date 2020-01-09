package d;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Fournis un argument !");
		} else {
			System.out
					.println(Palindrome.isPalindrome(args[0].toLowerCase()) ? "Palindrome !"
							: "Pas palindrome...");
		}
	}
}
