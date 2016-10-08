public class P2ECardDriver{
    public static void main (String[] args){
        P2ECard blankcard = new P2ECard();
        P2ECard numbercard = new P2ECard ( "♦", "", 7 );
        P2ECard facecard = new P2ECard ( "♠", "K", 10 );
        
        System.out.println ( "Three Card Objects" + "\n" + blankcard );
        System.out.println ( numbercard );
        System.out.println ( facecard + "\n" + "\n" + "\n" + "Array: myHand" );
        
        
        P2ECard[] myHand = new P2ECard[3];
        P2ECard card0 = new P2ECard ( "♥", "J", 10 );
        P2ECard card1 = new P2ECard ( "♣", "", 5 );
        P2ECard card2 = new P2ECard ( "♠", "Q", 10 );
        myHand[0] = card0;
        myHand[1] = card1;
        myHand[2] = card2;

        for ( int index = 0; index < myHand.length; index++ ){
            System.out.println ( myHand[ index ] );
        }
    }
}
