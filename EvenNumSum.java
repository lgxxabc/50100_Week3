package Week3;

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int value, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an Interger greater than 2: ");
		value = scan.nextInt();
		
		while(value < 2) {
			System.out.print ("Invalid input. Please reenter: ");
	        value = scan.nextInt();
		}
		
		for (int i = 2; i <= value; i += 2) {
			sum += i;
		}
		
		System.out.print ("The sum of all even integers between 2 and the input value is: " + sum);
		scan.close();
	}

}
