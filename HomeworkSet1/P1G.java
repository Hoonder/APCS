// Hunter Prescott
public class P1G
    {
        public static void main (String [] args)
        {
         int [] val = new int [10];
         for ( int a = 0; a < val.length; a++ )
         {
              int r = (int) ( Math.random() * 100);
              int index = (int) ( Math.random() * 10);
              if ( index % 3 == 0 ){
                r = r * -1;
              }
              val [a] = r;
          }//end for
          int i = 0;
          int h = 0;
          while ( i < val.length ) {
            System.out.println ( val [i] );
            if ( val [i] > 0 ){
                h++;
            }
            i++;
          }
          System.out.println ( "Number of positives is " + h );

        }// end method
    }// end class