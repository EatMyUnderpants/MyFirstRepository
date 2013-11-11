/*
 * The program requests 4-digit number and
 * prints decimals line by line.
 * */

import java.util.*;

public class ExtractingDigits
{
    static final int FIRST_DIGIT_VALUE  = 1000;
    static final int SECOND_DIGIT_VALUE =  100;
    static final int THIRD_DIGIT_VALUE  =   10;
    static final int FOURTH_DIGIT_VALUE =    1;

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a 4-digit number: ");
        int digits = console.nextInt();

        int firstDigit = digits / FIRST_DIGIT_VALUE;
        System.out.println(firstDigit);
        digits = digits % FIRST_DIGIT_VALUE;

        int secondDigit = digits / SECOND_DIGIT_VALUE;
        System.out.println(secondDigit);
        digits = digits % SECOND_DIGIT_VALUE;

        int thirdDigit = digits / THIRD_DIGIT_VALUE;
        System.out.println(thirdDigit);
        digits = digits % THIRD_DIGIT_VALUE;

        int fourthDigit = digits / FOURTH_DIGIT_VALUE;
        System.out.println(fourthDigit);
        digits = digits % FOURTH_DIGIT_VALUE;
    }
}














