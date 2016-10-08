public class P2IDriver{
    public static void main (String[] args){
        P2I profile1 = new P2I ( 1, "Hoonder", "Hunter Prescott", 2016, 499.99 );
        P2I profile2 = new P2I ( 2, "Tetragonals", "Abegail Bigasin", 2015, 799.99 );
        P2I profile3 = new P2I ( 3, "PeeChee", "Brandon Rodriguez", 2013, 399.99 );
        
        System.out.println ( profile1 );
        System.out.println ( profile2 );
        System.out.println ( profile3 );
    }
}