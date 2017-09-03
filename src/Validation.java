import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		for(int i=0;i<10;i++) {
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
		if(randomNumber ==  0) {
			System.out.println("Zero is always the hero!");
		}
		if(randomNumber ==  1) {
			System.out.println("One is the most important number!");
		}
		if(randomNumber ==  2) {
			System.out.println("Two is the first even number!");
		}
		if(randomNumber ==  3) {
			System.out.println("Three is my favorite number!");
		}
		if(randomNumber ==  4) {
			System.out.println("Four is the biggest number of these possibilities!");
		}
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}


