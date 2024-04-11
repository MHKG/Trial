import java.util.HashMap;
import java.util.Map;

public class AlphabetCounter {
	public static void main(String[] args) {
		String inputString = "Hello World";
		Map<Character, Integer> alphabetCounts = countAllAlphabets(inputString);

		// Display the counts
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
			int count = alphabetCounts.getOrDefault(alphabet, 0);
			if (count > 0) {
				System.out.println("The alphabet '" + alphabet + "' appears " + count + " times in the string.");
			}
		}
	}

	private static Map<Character, Integer> countAllAlphabets(String str) {
		Map<Character, Integer> alphabetCounts = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				char uppercaseC = Character.toUpperCase(c);
				alphabetCounts.put(uppercaseC, alphabetCounts.getOrDefault(uppercaseC, 0) + 1);
			}
		}
		return alphabetCounts;
	}
}
