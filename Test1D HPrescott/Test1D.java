import javax.swing.JOptionPane;
public class Test1D{
    public static void main (String[] args){
        String inputnumYears = JOptionPane.showInputDialog ( "How many years do you wish to project for the investment?" );
        int numYears = Integer.parseInt ( inputnumYears );
        
        String inputcurrentAge = JOptionPane.showInputDialog ( "What age will you begin investing?" );
        int currentAge = Integer.parseInt ( inputcurrentAge );
        
        String inputinvestmentAmount = JOptionPane.showInputDialog ( "How many US Dollars do you wish to invest?" );
        int investmentAmount = Integer.parseInt ( inputinvestmentAmount );
        
        String inputinterestRate = JOptionPane.showInputDialog ( "What interest rate do you think you will earn?" );
        double interestRate = Double.parseDouble ( inputinterestRate );
        
        int[] years = new int[ numYears ];
        
        for ( int index = 0; index < numYears; index++ ){
            years[ index ] = 2014 + index;
        }
        
        int[] ages = new int[ numYears ];
        
        for ( int index = 0; index < numYears; index++ ){
            ages[ index ] = currentAge + index;
        }
        
        double[] oneTimeInvestment =  new double[ numYears ];
        
        double[] annualInvestment = new double[ numYears ];
        
        for ( int index = 1; index < numYears; index++ ){
            oneTimeInvestment[ 0 ] = investmentAmount + ( interestRate * investmentAmount );
            oneTimeInvestment[ index ] = (oneTimeInvestment[ index - 1 ]) + ( interestRate * ( oneTimeInvestment[ index - 1 ] ));
        }
        
        for ( int index = 1; index < numYears; index++ ){
            annualInvestment[ 0 ] = investmentAmount + ( interestRate * investmentAmount );
            annualInvestment[ index ] = (annualInvestment[ index - 1]) + ( interestRate * ( annualInvestment[ index - 1 ] ) + investmentAmount );
        }
        
        System.out.println ( "\n" + "Investment Analysis" );
        System.out.println ( "Initial Investment: " + "$" + investmentAmount );
        System.out.println ( "Rate of return: " + ( interestRate * 100 ) + "%" );
        System.out.println ( "Year" + "\t" + "Age" + "\t" + "End of Year Balance One time investment" + "\t" + "End of Year Balance Annual Investment" );
        
        for ( int index = 0; index < numYears; index++ ){
            System.out.println ( years[ index ] + "\t" + ages[ index ] + "\t" + oneTimeInvestment[ index ] + "\t" + annualInvestment[ index ] );
        }
    }
}