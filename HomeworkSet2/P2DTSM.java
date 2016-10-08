public class P2DTSM{
    private String teamname;
    private int teammembers;
    public P2DTSM(){
        teamname = new String ("");
        int teammembers = 0;
    }
    public P2DTSM ( String teamname, int teammembers ){
        this.teamname = teamname;
        this.teammembers = teammembers;
    }
    public String toString(){
        String output = new String();
        output = "Team name is: " + teamname + "\n" +
                 "Amount of Team Members is: " + teammembers;
                 return output;
    }
}