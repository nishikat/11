/* Guess.java
 * Nishika Tripathi
 * 1404168
 * pa2
 * guessing the right number
 */

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		int  numberToGuess;
		numberToGuess = (int)(Math.random() * ((10)+1));
		Scanner input = new Scanner(System.in);
		int guess;
			
			System.out.println();
			System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.");
			System.out.println();
			System.out.print("Enter your first guess: ");
			guess = input.nextInt();
			if (guess == numberToGuess) 
			   {System.out.println("You win!");
			   System.out.println();
			   return;}
			else if (guess > 10)
                           {System.out.println("You have entered an invalid number.");
                           System.out.println();
			    return;}
			else if (guess < numberToGuess)
			   {System.out.println("Your guess is too low.");}
			else if (guess > numberToGuess)
			   {System.out.println("Your guess is too high.");}
			   System.out.println();
			   System.out.print("Enter your second guess: ");
			   guess = input.nextInt();
                        
			if (guess == numberToGuess)
                          {System.out.println("You win!");
			  System.out.println();
			  return;}
			else if (guess > 10)
                           {System.out.println("You have entered an invalid number.");
                           System.out.println();
			   return;}	
                        else if (guess < numberToGuess)
                           {System.out.println("Your guess is too low.");}
                        else if (guess > numberToGuess)
                           {System.out.println("Your guess is too high.");}
                           System.out.println();
			   System.out.print("Enter your third guess: ");
                           guess = input.nextInt();

			if (guess == numberToGuess)
                          {System.out.println("You win!");
			   System.out.println();
			   return;}
			else if (guess > 10)
                           {System.out.println("You have entered an invalid number.");
                           System.out.println();
			   return;}
                        else if (guess < numberToGuess)
                           {System.out.println("Your guess is too low.");}
                        else if (guess > numberToGuess)
                           {System.out.println("Your guess is too high.");}
			   System.out.println();
			   System.out.println("You lose. The number was " + numberToGuess + ".");
			   System.out.println();
			   return;
			} 
		}
	






