import java.io.*;
import java.util.*;

public class ThreeMiniGames
{
    static Scanner console = new Scanner(System.in);

    static final int FIRST_DIGIT_VALUE  = 10000;
    static final int SECOND_DIGIT_VALUE =  1000;
    static final int THIRD_DIGIT_VALUE  =   100;
    static final int FOURTH_DIGIT_VALUE =    10;
    static final int FIFTH_DIGIT_VALUE  =     1;

    public static void ThreeMiniGames(String [] args) throws java.io.FileNotFoundException
    {
	System.out.println("Do you want to play with me? Here's a list:"
	+ "\n\n1 - Guess a Number Game" + "\n2- Average of a Five-Digit Number"
	+ "\n3- Convert letters to digits in a Phone Number");

	boolean validity = false;

	while (!validity)
	{
            System.out.println("Please input the number of the desired game: ");
	    int MiniGame = console.nextInt();
	    System.out.println();

	    boolean Games = MiniGame >= 1 && MiniGame <=3;
            
            if (Games)
            {
                if (MiniGame == 1)
                {
                    GuessNumberLoop();
                }
                else if (MiniGame == 2)
                {
                    AverageFiveDigits();
                }
                else if (MiniGame == 3)
                {
                    RequestPhoneNumber();
                }
                validity = true;
            }
            else
            {
                System.out.print("Sorry, that is not a valid option. Please "
                + "try again.");
            }
	}
    }
    public static void GuessNumberLoop() throws FileNotFoundException
    {
	Scanner inFile = new Scanner(new FileReader("Value.txt"));

	System.out.println("\nSo you want to play a guessing game? " +
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
    public static void AverageFiveDigits()
    {
        System.out.println("\nSo you want to get an average of a Five-Digit"
        + "Number?");

        boolean valid = false;

	while (!valid)
	{
            System.out.print("Please input a Five-digit Number: ");
            String Number = console.next();
            System.out.println();

            boolean invalid = Number.trim().length() !=5;
            
            if (!invalid)
            {
                int value = Integer.parseInt(Number);
                int firstDigit = value / FIRST_DIGIT_VALUE;
                value = value % FIRST_DIGIT_VALUE;

                int secondDigit = value / SECOND_DIGIT_VALUE;
                value = value % SECOND_DIGIT_VALUE;

                int thirdDigit = value / THIRD_DIGIT_VALUE;
                value = value % THIRD_DIGIT_VALUE;

                int fourthDigit = value / FOURTH_DIGIT_VALUE;
                value = value % FOURTH_DIGIT_VALUE;

                int fifthDigit = value / FIFTH_DIGIT_VALUE;
                value = value % FIFTH_DIGIT_VALUE;

                int Sum = (firstDigit + secondDigit + thirdDigit + fourthDigit +
                fifthDigit);
                float Average = Sum/5f;
                System.out.println("The average of your number is " + Average);
                valid = true;
            }
            else
            {
                System.out.println("        ***Warning***\nThat is not a " +
                "Five-digit Number. \n        ***Warning***");
            }
	}
    }
    public static void RequestPhoneNumber()
    {
        System.out.println("\nSo you want to convert letters to digits in a "
        + "phone number?");
        
	boolean valid = false;

    	while(!valid)
    	{
            System.out.print("Please enter a phone number with Alphanumeric: ");
	    String phoneNumber = console.next();
            System.out.println();

	    boolean invalid = phoneNumber.trim().length() <=10 &&
            phoneNumber.trim().length() >=16;

            if (!invalid)
            {
                ConvertLettersToDigit(phoneNumber);
                valid =true;
            }
	    else
	    {

		System.out.println("        ***Warning***\nThat is not a valid " +
                "Phone Number.\n        ***Warning***\n        Please try again.");
	    }
	}
    }
    public static void ConvertLettersToDigit(String phoneNumber)
    {
	Map sMap = new HashMap();

	sMap.put("[a-c]", "2");
	sMap.put("[d-f]", "3");
	sMap.put("[g-i]", "4");
	sMap.put("[j-l]", "5");
	sMap.put("[m-o]", "6");
	sMap.put("[p-s]", "7");
	sMap.put("[t-v]", "8");
	sMap.put("[w-z]", "9");

	phoneNumber = phoneNumber.toLowerCase();

	Iterator keys = sMap.keySet().iterator();

	while (keys.hasNext())
	{
	    String regex = (String) keys.next();
	    String replacement = (String) sMap.get(regex);
	    phoneNumber = phoneNumber.replaceAll(regex, replacement);
	}
	System.out.println(phoneNumber);
    }

}
	