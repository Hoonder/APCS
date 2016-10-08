public class P2ASong{
    private String songName;
    private String songArtist;
    private String songGenre;
    public P2ASong(){
        songName = new String ( "Truce" );
        songArtist =  new String ( "twenty one pilots" );
        songGenre = new String ( "Rock" );
    }
    public P2ASong ( String songName, String songArtist, String songGenre ){
        this.songName = songName;
        this.songArtist = songArtist;
        this.songGenre = songGenre;
    }
    public String toString(){
        String output = new String();
        output = "Song name is: " + songName + "\n" + 
                 "Song artist is: " + songArtist + "\n" +
                 "Song genre is: " + songGenre + "\n";
                 return output;
    }
}