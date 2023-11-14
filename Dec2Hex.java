import java.util.logging.Logger;

class Dec2Hex
{
	// Declare Logger for the Dec2Hex class
	private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static int Arg1;

    public static void main(String args[])
    {
	if (args.length == 0)
	{
	   System.out.println("Error: No input argument provided. Please provide a valid integer.");
	   return;
	}

	try{
	
	Arg1 = Integer.parseInt(args[0]);
	if (Arg1 < 0) {
                System.out.println("Error: Negative integers are not supported."); 
                return;
            }
        
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
	int num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
{
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
	}catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer. Please provide a decimal number.");
        }
    }
}
