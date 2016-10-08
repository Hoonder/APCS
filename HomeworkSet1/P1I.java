// Hunter Prescott
import javax.swing.JOptionPane;
public class P1I{
    public static void main (String[]args){
        String username = JOptionPane.showInputDialog ( "Please enter Username" );
        String pass = JOptionPane.showInputDialog ( "Please enter Password" );
        if ( username.equals ( "Hoonder" ) & pass.equals ( "prescott" )){
        System.out.println ( "You have successfully logged in" );
    }
        else{
        System.out.println ( "Login unsuccessful...try again" );
    }
  }
}


