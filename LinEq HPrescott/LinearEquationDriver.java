import javax.swing.JOptionPane;
public class LinearEquationDriver{
    public static void main (String[] args){
        System.out.println ( "Your equations should be in the form: ax + by = e and cx + dy = f" );
        
        String inputA = JOptionPane.showInputDialog ( "Please enter a" );
        int a = Integer.parseInt ( inputA );
        
        String inputB = JOptionPane.showInputDialog ( "Please enter b" );
        int b = Integer.parseInt ( inputB );
        
        String inputC = JOptionPane.showInputDialog ( "Please enter c" );
        int c = Integer.parseInt ( inputC );
        
        String inputD = JOptionPane.showInputDialog ( "Please enter d" );
        int d = Integer.parseInt ( inputD );
        
        String inputE = JOptionPane.showInputDialog ( "Please enter e" );
        int e = Integer.parseInt ( inputE );
        
        String inputF = JOptionPane.showInputDialog ( "Please enter f" );
        int f = Integer.parseInt ( inputF );
        
        LinearEquation equation = new LinearEquation( a, b, c, d, e, f );
        
        if ( equation.isSolvable()){
            JOptionPane.showMessageDialog ( null, "X = " + equation.getX(), "X Value", JOptionPane.INFORMATION_MESSAGE );
            JOptionPane.showMessageDialog ( null, "Y = " + equation.getY(), "Y Value", JOptionPane.INFORMATION_MESSAGE );
        }
        else{
            JOptionPane.showMessageDialog ( null, "The equation has no solution.", "Error", JOptionPane.ERROR_MESSAGE );    
        }
   }
}

