// Hunter Prescott
public class P1H{
    public static void main ( String [] args){
        System.out.println ( "My favorite artists other than Michael Jackson" );
        String [] artists = { "Cam Meekins ", "Twenty one pilots ", "EDEN " };
       
       for ( int a = 0; a < artists.length; a++ ){
            System.out.println ( artists[a] );
            
        }
       System.out.println ( "\n" + "\n" );
       int index = (int) ( Math.random() * 2);
        for ( int b = 0; b < artists.length; b++ ) {
        if ( index == 0 ){
             artists [0] = "Michael Jackson";
             System.out.println ( artists[b] );
            }
        if ( index == 1 ){
             artists [1] = "Michael Jackson";
             System.out.println ( artists[b] );
            }
        if ( index == 2 ){
             artists [2] = "Michael Jackson";
             System.out.println ( artists[b] );
         }
         //else{
            //artists[2] = "Michael Jackson";
            //System.out.println ( artists[b]);
        //}
       }
       for (int c = 0; c < artists.length; c++){
           if ( artists[c].equals ( "Michael Jackson" )){
               System.out.println ( "We found Michael Jackson in " + c );
            }
           else{
               System.out.println ( "Michael Jackson not found in " + c);
            }
        }
   }
}
    
    