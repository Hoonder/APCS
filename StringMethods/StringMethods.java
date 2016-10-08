import java.util.Scanner;
public class StringMethods{
    public static void main (String[] args){
        System.out.println ( "Testing String methods ... " );
        
        Scanner input = new Scanner ( System.in );
        String statement = input.nextLine();
        //computer
        //01234567
        
        System.out.println ( "You typed: " + statement );
        
        //.length
        System.out.println ( "Length of String is: " + statement.length() );
        
        //substring (int, int) doesnt need two int
        System.out.println ( "Result of substring is: " + statement.substring ( 3 ) ); //remember 0123456 counting starts at 0
        System.out.println ( "Result of substring is: " + statement.substring ( 3, 6 ) ); //include 1st number dont include second
        
        //indexOf (where started)
        System.out.println ( "Result of indexOf is: " + statement.indexOf ( "put" ) );
        
        //compareTo (if first 2 letters are same it goes to the next one)
        System.out.println ( "Result of compareTo is: " + statement.compareTo ( "Orange" ) ); //letters before in alphabet
        
        //trim
        System.out.println ( "Result of trim is: " + statement.trim () );
        
        //toLowerCase
        System.out.println ( "Result of toLowerCase is: " + statement.toLowerCase() );
    }
}