import java.util.*;

public class MakeChange
{
	static Scanner console = new Scanner(System.in);
	
	static final int TWENTY = 20;
	static final int TEN = 10;
	static final int FIVE = 5;
	static final int TWO = 2;
	static final int ONE = 1;
	static final int COIN25 = 25;
	static final int COIN10 = 10;
	static final int COIN5 = 5;

		
	public static void main (String[] args)
	{
	
	int dollars;
	int cents;
	cents = cents + 3;

	System.out.print("Enter the amount of dollars: ");
	dollars = console.nextInt();
	System.out.println();

	System.out.print("Enter the amount of cents: ");
	cents = console.nextInt();
	System.out.println();

	System.out.println("The amount you entered is " + dollars + "." 
	+ cents + "$");


	cents = cents + 3;	
	System.out.println("The number of 20$ " + "to be returned is " 
	+ dollars / TWENTY);
	
	dollars = dollars % TWENTY;

	System.out.println("The number of 10$ " + "to be returned is " 
	+ dollars / TEN);
	
	dollars = dollars % TEN;

	System.out.println("The number of 5$ " + "to be returned is "
	+ dollars / FIVE);

	dollars = dollars % FIVE;

	System.out.println("The number of 2$ " + "to be returned is "
	+ dollars / TWO);

	dollars = dollars % TWO;

	System.out.println("The number of 1$ " +"to be returned is "
	+ dollars / ONE);
	
	dollars = dollars % ONE;

	System.out.println("The number of 25 CENTS " + "to be returned is " 
	+ cents / COIN25);
	
	cents = cents % COIN25;

	System.out.println("The number of 10 CENTS " + "to be returned is " 
	+ cents / COIN10);
	
	cents = cents % COIN10;

	System.out.println("The number of 5 CENTS " + "to be returned is "
	+ cents / COIN5);

	cents = cents / COIN5;
		
	}

}