package Week3;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		int other = 0;
		String words;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		words = scan.nextLine();
		
		for (int t = 0; t < words.length(); t++) {
			char c = words.charAt(t);
			
			if (c == 'a') {
				a++;
			} else if (c == 'e') {
				e++;
			} else if (c == 'i') {
				i++;
			} else if (c == 'o') {
				o++;
			} else if (c == 'u') {
				u++;
			} else {
				other++;
			}
		}
		
		System.out.println("Here is a summary of "
				+ "lowercase vowel appear in the entire string: " + "\n" + 
				"a: " + a + "\n" + 
				"e: " + e + "\n" +
				"i: " + i + "\n" +
				"o: " + o + "\n" +
				"u: " + u + "\n" +
				"other: " + other);
		
		scan.close();
	}

}
