package com.scrum.guessnumber;

import java.util.Scanner;

public class GuessTheNumber {

	// creating a method with return as void to call in the main class
	public void playGame() {
		
		//creating random number range 1-100
		int answer = (int) (Math.random() * 100) + 1;
		// taking total three trials
		int numberOfTrials = 3;
		boolean tries = false;
		Scanner sc = new Scanner(System.in);

		//message in a console
		System.out.println(
				"Lets play a game! \n You will guess the number if the number is correct you will win otherwise you will lose");

		// running loop for three time but if the guess is correct then loop will stop there itself
		while (numberOfTrials > 0) {

			System.out.println("Enter your guess: ");
 
			//guess number will store in guess variable
			int guess = sc.nextInt();
			if (guess == answer) {
				System.out.println("You guessed the correct number\n You win!");
				break;
			} else if (guess > answer) {
				System.out.println("Your Guess is  high.\n You have " + (numberOfTrials - 1) + " left");
				numberOfTrials--;
			} else {
				System.out.println("Your Guess is  low.\n You have " + (numberOfTrials - 1) + " left");
				numberOfTrials--;
			}
		}

		// if the guess is incorrect it will display this message
		if (tries == false) {
			System.out.println("You ran out of tries.\n You lose!");
		}

	}

}
