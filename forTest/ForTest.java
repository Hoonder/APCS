public class ForTest
    {
     public static void main (String[] args)
        {
         // Method 1 to create an array
         int [] myNumbers = { 0, 1, 2, 3, 4, 5, 6 };
         
         // Method 2 to create an array
         int [] randomNumbers = new int [100];
         // create the array
         for( int index = 0; index < randomNumbers.length; index++ )
            {
             randomNumbers [ index ] = (int) ( Math.random () * 100 );   
            } // end for
        
          }// end method main
     } // end class ForTest       
           
         
         
            
         
            
        
        
    