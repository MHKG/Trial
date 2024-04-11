public class Strings {
	public static void main(String[] args) {
		int vowelCount = 0;
		int consonantCount = 0;
		String string = "Mehul";
		char[] str = string.toCharArray();
		for (char c : str) {
			if (isVowel(c)) {
				vowelCount++;
			} else if (Character.isLetter(c)) {
				consonantCount++;
			}
		}
		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonants: " + consonantCount);
	}

	private static boolean isVowel(char c) {
		c = Character.toUpperCase(c);
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
}
