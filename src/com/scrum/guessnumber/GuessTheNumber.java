package com.scrum.guessnumber;

import java.util.Scanner;

public class GuessTheNumber {

	public void playGame() {
		int answer = (int) (Math.random() * 100) + 1;
		int numberOfTrials = 3;
		boolean tries = false;
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Lets play a game! \n you will guess the number if the number is correct you will win otherwise you loose");

		while (numberOfTrials > 0) {

			System.out.println("Enter your guess: ");

			int guess = sc.nextInt();
			if (guess == answer) {
				System.out.println("You guessed the correct number\n You win!");
				break;
			} else if (guess < answer) {
				System.out.println("Your Guess is  high.\n You have " + (numberOfTrials - 1) + "left");
				numberOfTrials--;
			} else {
				System.out.println("Your Guess is  low.\n You have " + (numberOfTrials - 1) + "left");
				numberOfTrials--;
			}
		}

		if (tries == false) {
			System.out.println("You ran out of tries.\n You lose");
		}

	}

}
