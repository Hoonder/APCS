import javax.swing.JOptionPane;
public class Inputdata
    {
       public static void main (String[] args)
       {
           int sum = 0;
           String input = JOptionPane.showInputDialog
           ("Press 1 for Monday \n" +
            "Press 2 for Tuesday");
            System.out.println (input);
            int num = Integer.parseInt (input);
            sum = 5 + num;
            System.out.println (sum);
        
        
        
        } //end method
    } //end class InputData
