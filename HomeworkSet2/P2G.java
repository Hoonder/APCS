public class P2G{
    public static void main (String[] args){
        String[] colleges = { "UCSD", "UCI", "UC Davis", "UCR" };
        for ( int index = 0; index < colleges.length; index++ ){
            System.out.println ( colleges[ index ] );
            System.out.println ( colleges[ index ].length() );
        }
        
        System.out.println ( "\n" + "Shortest length: " + colleges[ 2 ] + "\n" );
        
        colleges[ 3 ] = null;
        
        for ( int index = 0; index < colleges.length; index++ ){
            System.out.println ( colleges[ index ] );
        }
    }
}