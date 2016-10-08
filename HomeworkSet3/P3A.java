import javax.swing.JOptionPane;
public class P3A{
    private String songName;
    private String songArtist;
    private String songGenre;
    private int yearReleased;
    private int inputSongLengthSec;
    public P3A(){
        songName = new String ( "Truce" );
        songArtist =  new String ( "twenty one pilots" );
        songGenre = new String ( "Rock" );
    }
    
    public P3A ( String songName, String songArtist, String songGenre, int yearReleased, int inputSongLengthSec ){
        this.songName = songName;
        this.songArtist = songArtist;
        this.songGenre = songGenre;
        this.yearReleased = yearReleased;
        this.inputSongLengthSec = inputSongLengthSec;
    }
    
    public int getYearReleased(){
        return yearReleased;
    }
    


    public void setYearReleased( int yearReleased ){
        int counter = 0;
        while ( true ){
            String username = JOptionPane.showInputDialog ( "Enter Username" );
            String password = JOptionPane.showInputDialog ( "Enter Password" );
            if ( username.equals ( "Hoonder" ) && password.equals ( "prescott" )){
                System.out.println ( "You have successfully logged in" );
                this.yearReleased = yearReleased;
                break;
            }
                else{
                    System.out.println ( "Login unsuccessful...stop trying to hack me" );
                    counter++;
                        if ( counter == 3 ){
                        System.out.println ( "You have exceeded your three attempts. Please try again next period." );
                        break;
                    }
            }
        }
    }
    
    public String convertToMinSec(){
        int songLengthFinalMin = inputSongLengthSec/60;
        int songLengthFinalSec = inputSongLengthSec % 60;
        return "The length of the song is: " + (int) Math.floor( songLengthFinalMin ) + " minutes and " + songLengthFinalSec + " Seconds";
    }
    
    public String toString(){
        String output = new String();
        output = "Song name is: " + songName + "\n" + 
                 "Song artist is: " + songArtist + "\n" +
                 "Song genre is: " + songGenre + "\n" +
                 "Year Released: " + yearReleased + "\n" +
                 convertToMinSec();
                 return output;
    }
}
    