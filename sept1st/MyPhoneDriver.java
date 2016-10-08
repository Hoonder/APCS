public class MyPhoneDriver{
    public static void main (String [] args){
        int num = 5;
        String name = new String ("Hello");
        MyPhone myOtherCell = new MyPhone();
        MyPhone myCell = new MyPhone( 256, 99.9, "Verizon", false  );
        
        System.out.println (myCell);
        System.out.println ( "\n" );
        System.out.println ( myOtherCell );
        
        System.out.println ( "\n\n" );
        System.out.println ( myOtherCell.getMemoryCapacity() );
        myOtherCell.setMemoryCapacity ( 32 );
        System.out.println ( myOtherCell.getMemoryCapacity() );
        System.out.println ( myOtherCell );
    }
    
}