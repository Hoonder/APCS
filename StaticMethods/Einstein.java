public class Einstein{
    private static final double C = 3.0E8; // speed of light in m/s
    private static final String[] Quotes = 
    { "A person who never made a mistake never tried anything new.",
      "We cannot solve problems with the same thinking we used when we created them.",
      "Insanity: doing the same thing over and over again and expecting different results.",
      "Logic will get you from A to B, imagination will take you everywhere." };
                                      
    public static double calcEnergy ( double mass ){
        return mass * C * C;
    }
    
    public static String WordsOfWisdom(){
        int index = (int) ( Quotes.length * Math.random() );
        return Quotes [ index ];
    }
}