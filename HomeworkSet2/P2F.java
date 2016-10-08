public class P2F{
    public static void main (String[] args){
        double[] baseballavgs = new double [9];
        for ( int index = 0; index < baseballavgs.length; index++ ){
            baseballavgs[ index ] = Math.random() * .5;
        }
        for ( int index = 0; index < baseballavgs.length; index++ ){
            System.out.println ( baseballavgs[ index ] );
        }
        double max = baseballavgs[0];
        for ( int index = 0; index < baseballavgs.length; index++ ){
            if ( baseballavgs[ index ] > max ){
                max = baseballavgs[ index ];
            }
        }
        System.out.println ( "The highest batting average is: " + max );
        }
}