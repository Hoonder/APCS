// Hunter Prescott Period 5
// QuadPjtHPrescott
import java.util.*;
public class QuadraticFormula {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ( "Enter a" );
        double a = input.nextDouble();
        System.out.println ( "Enter b" );
        double b = input.nextDouble();
        System.out.println ( "Enter c" );
        double c = input.nextDouble();
        input.close(); 

        double discr = Math.pow(b, 2) - 4 * a * c;
        
        double answer1 = ( -b + Math.sqrt (Math.pow (b, 2) - (4 * a * c))) / (2 * a);
        double answer2 = ( -b - Math.sqrt (Math.pow (b, 2) - (4 * a * c))) / (2 * a);

        if ( discr < 0 ) {
            System.out.println ( "The equation has no real roots" );
            return;
        }
        if ( discr > 0 ) {
            System.out.println ( "The equation has two roots " + answer1 + " and " + answer2);
            return;
        }
        if ( discr == 0 ) {
            System.out.println ( "The equation has one root " + answer1 );
        }
    }// end class
}// end class
