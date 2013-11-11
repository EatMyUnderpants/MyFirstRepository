import java.util.*;

public class AverageFiveDigits
{
    static Scanner console = new Scanner(System.in);
    static final int FIRST_DIGIT_VALUE  = 10000;
    static final int SECOND_DIGIT_VALUE =  1000;
    static final int THIRD_DIGIT_VALUE  =   100;
    static final int FOURTH_DIGIT_VALUE =    10;
    static final int FIFTH_DIGIT_VALUE  =     1;

    public static void AverageFiveDigits(String[] args)
    {
        System.out.print("Please input a Five-digit Number: ");

        int Sum;
        String Number;

        boolean valid = false;

	while (!valid)
	{
            Number = console.nextLine();
            System.out.println();
            
            boolean invalid = Number.trim().length() !=5;

            if (invalid)
            {
                System.out.println("***Warning*** That is not a Five-digit Number."
                + " ***Warning***");
                System.out.print("Please input a Five-digit Number: ");
            }
            if (!invalid)
            {
                valid = true;
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

                Sum = (firstDigit + secondDigit + thirdDigit + fourthDigit +
                fifthDigit);
                float Average = Sum/5f;
                System.out.println("The average of your number is " + Average);
            }
	}
    }
}