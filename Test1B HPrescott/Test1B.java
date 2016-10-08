import javax.swing.JOptionPane;
public class Test1B{
    public static void main (String[] args){
        String numDays = JOptionPane.showInputDialog ( "Please enter the number of days you wish to view." );
        int intnumDays = Integer.parseInt ( numDays );
        int [] dates = new int [intnumDays];
        int [] dailyTemps = new int [intnumDays];
        
        for ( int index = 0; index < intnumDays; index++ ){
            dates[ index ] = index + 1;
        }
        
        for ( int index = 0; index < intnumDays; index++ ){
            dailyTemps[ index ] = -100 + (int) (Math.random() * 201);
        }
        
        String [] forecast = new String[intnumDays];
        
        for ( int index = 0; index < intnumDays; index++ ){
            if ( dailyTemps[ index ] >= 80 ){
            forecast[index] = new String ( "Hot" );
         }
            if ( dailyTemps[ index ] < 80 && dailyTemps[ index ] >= 50 ){
            forecast[index] = new String ( "Moderate" );
         }
            if ( dailyTemps[ index ] < 50 && dailyTemps[ index ] >= 32 ){
            forecast[index] = new String ( "Cold" );
         }
            if ( dailyTemps[ index ] < 32 ){
            forecast[index] = new String ( "Freezing" ); 
         }
        }
        
        System.out.println ( "\n" );
        System.out.println ( "Date" + "\t" + "Daily Temp" + "\t" + "Forecast" );
        
        for ( int index = 0; index < intnumDays; index++ ){
            System.out.println ( dates[ index ] + "\t" + dailyTemps[ index ] + "\t" + forecast[ index ] );
        }
    }
 }
