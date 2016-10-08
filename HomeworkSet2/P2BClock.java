public class P2BClock{
    private String hours;
    private String mins;
    private String seconds;
    public P2BClock(){
        String hours = "0";
        String min = "0";
        String seconds = "0.0";
    }
    public P2BClock ( String hours, String mins, String seconds ){
        this.hours = hours;
        this.mins = mins;
        this.seconds = seconds;
    }
    public String toString(){
        String output = new String();
        output = hours + ":" + mins + ":" + seconds + "\n";
                 
        return output;
    }
}