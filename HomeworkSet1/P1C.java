// Hunter Prescott
import java.util.Scanner;
public class P1C
{    
    public static void main (String [] args)
        {
            int a;
            System.out.println ( "Please Enter an integer to check if it is odd or even." );
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            
            if ( a % 2 == 0 )
                System.out.println ( a + " is an even number." );
            else
                System.out.println ( a + " is an odd number." );
                
         }// end method
        
    }// end class
    