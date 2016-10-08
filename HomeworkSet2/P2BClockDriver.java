import javax.swing.JOptionPane;
public class P2BClockDriver{
    public static void main (String[] args){
        P2BClock kitchenClock = new P2BClock( "0", "0", "0.0" );
        String bedroominputhours = JOptionPane.showInputDialog( "Please enter desired Bedroom Clock hours." );
        String bedroominputminutes = JOptionPane.showInputDialog( "Please enter desired Bedroom Clock minutes." );
        String bedroominputseconds = JOptionPane.showInputDialog( "Please enter desired Bedroom Clock seconds." );
        P2BClock bedroomClock = new P2BClock ( bedroominputhours, bedroominputminutes, bedroominputseconds );
        
        
        System.out.println ( "Kitchen Clock time is:" );
        System.out.println ( kitchenClock );
        System.out.println ( "Bedroom Clock time is:" );
        System.out.println ( bedroomClock );
    }
}