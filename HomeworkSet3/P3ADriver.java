import javax.swing.JOptionPane;
public class P3ADriver{
    public static void main (String[] args){
        String inputYearReleased = JOptionPane.showInputDialog ( "Enter Year Released." );
        int yearReleased = Integer.parseInt ( inputYearReleased );
        
        String originalSongLength = JOptionPane.showInputDialog ( "Enter Song Length in seconds." );
        int inputSongLengthSec = Integer.parseInt ( originalSongLength );
         

        P3A song2 = new P3A ( "Heavydirtysoul", "twenty one pilots", "Rock", 69 , inputSongLengthSec );
        song2.setYearReleased( yearReleased );

        System.out.println ( "Getter Method Test: " + song2.getYearReleased() + "\n\n\n");
        System.out.println ( song2.toString() );
    }
}
