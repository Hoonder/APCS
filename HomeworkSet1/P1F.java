// Hunter Prescott
public class P1F
    {
        public static void main (String [] args)
        {
         int [] fiftyintegers = new int [50];
         
        for ( int a = 0; a < fiftyintegers.length; a++)
            {
             fiftyintegers [a] = (int) ( Math.random() * 100 );
             
         }//end for
        
        for ( int b = 0; b < fiftyintegers.length; b++)
            {
         System.out.println (fiftyintegers [b]);
         }//end for
    }//end method
    }// end class