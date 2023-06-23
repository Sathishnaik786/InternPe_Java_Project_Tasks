import java.util.Scanner;
import java.util.Random;

class Guessnumber
{
    private static int randNum;

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String play = "yes";
        while (play.equals("yes"))
    {
        Random rand = new Random();
        int random = rand.nextInt(100);
        int guess = -1;
        int triess = 0;
        while(guess != random)
        {
            System.out.print("Guess a number between 1 and 100: ");
            guess = reader.nextInt();
            triess++;

            if(guess == randNum)
            {
                System.out.println("Awesome! You guessed the number:");
                System.out.println("It only took you" + triess + " guesses!");
                System.out.print("Would uoy like to play again? Yes or No: ");
                play = reader.next().toLowerCase();
            }
            else if(guess > randNum)
            {
                System.out.println("Your guess is too high, try again.");
            }
            else
            {
                System.out.println("Your guess is too low, try again.");
            }
        }
    }

    reader.close(); 
    }
}
