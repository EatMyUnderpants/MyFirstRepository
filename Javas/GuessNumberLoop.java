import java.util.*;
import java.io.*;

public class GuessNumberLoop
{
    static Scanner console = new Scanner(System.in);

    public static void GuessNumberLoop(String[] args) throws FileNotFoundException
    {
	Scanner inFile = new Scanner(new FileReader("I:\\Value.txt"));

	System.out.println("You want to play a guessing game? " +
        "You only have 5 tries!!");

        int Count = 0;
        int Tries = 5;
	int Answer = inFile.nextInt();
        inFile.close();

	boolean GuessIt = false;

        while (Count <= 4 && !GuessIt)
	{
            System.out.print("Guess a number between 1-100: ");
            int Guess = console.nextInt();
            System.out.println();

            boolean CorrectAnswer = Guess == Answer;
	    boolean HighAnswer = Guess > Answer;
            boolean LowAnswer = Guess < Answer;
            boolean NumericRange = Guess > 0 && Guess <=100;

            if (NumericRange)
            {
	        if (CorrectAnswer)
                {
		    GuessIt = true;
                }
                else if (!CorrectAnswer)
                {
            	    System.out.print("You've guessed wrong.");
                    if (HighAnswer)
                    {
                        System.out.println("\nPlease try again" +
			" with a lower number!! \nNumber of tries left: "
			+ (--Tries));
                    }
                    else if (LowAnswer)
                    {
                        System.out.println("\nPlease try again" +
			" with a higher value!! \nNumber of tries left: "
			+ (--Tries));
                    }
            }
            Count ++;
            }
            else
            {
                System.out.println("That is an invalid Number." +
		" Please try again!!");
            }
        }
        if (GuessIt)
        {
            System.out.println("Congratulations!! You've guessed it " +
	    "correctly!! You're so AWESOME!! ^ ^");
            System.out.println("It took you " + Count + " tries!");
        }
        else
        {
            System.out.println("\nSorry you've used all your tries. " +
            "Thank you for playing!!");
        }
    }
}