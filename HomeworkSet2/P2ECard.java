public class P2ECard{
    private String suit;
    private String face;
    private int value;
   //private int sum;
    public P2ECard(){
        suit = new String ("");
        face = new String ("");
        int value = 0;
       //int sum = 0;
    }
    public P2ECard ( String suit, String face, int value/*, int sum*/ ){
        this.suit = suit;
        this.face = face;
        this.value = value;
       //this.sum = sum;
    }
    public String toString(){
        String output = new String();
        output = "|" + value + "--------------" + "|" + "\n" +
                 "|" + suit + "               |" + "\n" +
                 "|                |" + "\n" +
                 "|                |" + "\n" +
                 "|                |" + "\n" +
                 "|                " + suit + "|" + "\n" +
                 "|----------------" + value  + "|"
        /* output = "Card Suit: " + suit + "\n" +
                 "Card Face: " + face + "\n" +
                 "Card Value: " + value + "\n" /*+
                 "Card sum: " + sum*/; 
                 return output;
    }
    }