// Hunter Prescott
public class P1D
{
 public static void main (String [] args)
 {
  for ( int a = 1; a <= 10; a++ )
    {
    	int random = ( int )( Math.random() * ( ( a * a ) - ( a ) ) + ( a ) ) ;
        System.out.println ( a + "\t" + a*a + "\t" + random);
    }// end for
  
     
    }//end method   
}// end class P1D