public class NumberFormat{
    public static void main ( String[] args ){
        double myNumber1 = 456743.0342175;
        double myNumber2 = 3.1415926;
        
        System.out.println ( "Without formatting, my numbers are: " + myNumber1 + ", " + myNumber2 + "\n" );
        
        System.out.println ( "Now with formatting!..." );
        
        //Create correctly formatted string
        String s = String.format ( "My numbers are %.3f and %.4f...NIIAAACCEEE!!", myNumber1, myNumber2 );
        //f stands for float (like a double except it has less memory allocation)
        //now print the "formatting" string
        
        System.out.println ( s );
    }
}