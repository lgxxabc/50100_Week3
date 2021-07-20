package Week3;

//Inserted a while loop in AgeGuess2.java in Week2.

import java.util.Random;
import java.util.Scanner;

public class AgeGuess3 {

	public static void main(String[] args) {
		String name;
		int ageGuess;
		int age;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		age = generator.nextInt(101);
		
		System.out.print("Please enter your guess of age between 0~100: ");
		ageGuess = scan.nextInt();
		
		while (age != ageGuess) {
			System.out.println("You guessed wrong!");
			if (ageGuess > age) {
				System.out.println("The age is younger.");
			} else {
				System.out.println("The age is older");
			}
			System.out.println("Please enter your guess of age between 0~100: ");
			ageGuess = scan.nextInt();
		}
		
		System.out.println("Congratulations! The age was: " + age);
	}

}
