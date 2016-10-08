import javax.swing.JOptionPane;
public class P2H{
    public static void main (String[] args){
        int counter = 0;
        int a = 1;
        while ( a == 1 ){
        String username = JOptionPane.showInputDialog ( "Enter Username" );
        String password = JOptionPane.showInputDialog ( "Enter Password" );
        
        if ( username.equals ( "Hoonder" ) & password.equals ( "prescott" )){
            System.out.println ( "You have successfully logged in" );
            a = 9999;
        }
        else{
            System.out.println ( "Login unsuccessful...stop trying to hack me" );
            counter++;
            if ( counter == 3 ){
                System.out.println ( "You have exceeded your three attempts. Please try again next period." );
                a = 9999;
            }
        }
    }
 }
}