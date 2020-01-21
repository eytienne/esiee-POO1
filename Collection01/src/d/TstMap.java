package d;

import java.util.HashMap;
import java.util.Map;

public class TstMap {

	public static void main(String[] args) {
		Personne tpers[] = { new Personne("MARTIN", "Pierre", 28, "1720665005002"),
				new Personne("DUVAL", "Jean", 30, "1700465126022"),
				new Personne("DURAND", "Alain", 25, "1751265678031"),
				new Personne("DUPOND", "Martine", 35, "2650165047008"),
				new Personne("DUPONT", "Jeannine", 41, "2590265028015"),
				new Personne("LEGOFF", "Annie", 19, "2810765089017"),
				new Personne("LEGALL", "Bernard", 50, "1500965051001") };

		Map<String, Personne> pp = new HashMap<String, Personne>();
		for (int i = 0; i < tpers.length; i++)
			pp.put(tpers[i].getNumss(), tpers[i]);
		System.out.println(pp.get("1700465126022"));
	}

}
