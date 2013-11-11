import java.util.*;

public class RequestPhoneNumber
{
    static Scanner console = new Scanner(System.in);

    public static void RequestPhoneNumber()
    {
	System.out.println("Please enter a phone number with Alphanumeric: ");
        
	boolean valid = false;

    	while(!valid)
    	{
	    String phoneNumber = console.nextLine();

	    boolean invalid = phoneNumber.trim().length() <=10 &&
            phoneNumber.trim().length() <=16;

            if (!invalid)
            {
                ConvertLettersToDigit(String phoneNumber);
		valid = true;
            }
	    else
	    {
		
		System.out.println("***Warning*** That is not a valid Phone Number."
                + " ***Warning***" + "\nPlease try again.");
	    }
	}
    }
    public static void ConvertLettersToDigit(String phoneNumber)
    {
	java.util.Map sMap = new java.util.HashMap();

	sMap.put("[a-c]", "2");
	sMap.put("[d-f]", "3");
	sMap.put("[g-i]", "4");
	sMap.put("[j-l]", "5");
	sMap.put("[m-o]", "6");
	sMap.put("[p-s]", "7");
	sMap.put("[t-v]", "8");
	sMap.put("[w-z]", "9");
            	
	phoneNumber = phoneNumber.toLowerCase();

	java.util.Iterator keys = sMap.keySet().iterator();
        
	while (keys.hasNext())
	{	
	    String regex = (String) keys.next();
	    String replacement = (String) sMap.get(regex);
	    phoneNumber = phoneNumber.replaceAll(regex, replacement);
	}
	System.out.println(phoneNumber);
    }
}