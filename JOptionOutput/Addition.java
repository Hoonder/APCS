import javax.swing.JOptionPane;
public class Addition{
    public static void main( String[] args){
        int num1 = 10;
        int num2 = 20;
        
        int sum = num1 + num2;
        
        System.out.println ( "The sum is: " + sum );//good
        // ( null, input, title, JOptionPane.[   _MESSAGE];
        JOptionPane.showMessageDialog ( null, "The sum is: " + sum, "The Summing Program", JOptionPane.PLAIN_MESSAGE );
        
        //.ERROR_MESSAGE
        //.INFORMATION_MESSAGE
        //.WARNING_MESSAGE
        //.QUESTION_MESSAGE
        //.PLAIN_MESSAGE
    }
}