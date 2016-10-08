public class P2I{
    private int profileNumber;
    private String screenName;
    private String userName;
    private int yearPurchased;
    private double productPrice;
    
    public P2I ( int profileNumber, String screenName, String userName, int yearPurchased, double productPrice ){
        this.profileNumber = profileNumber;
        this.screenName = screenName;
        this.userName = userName;
        this.yearPurchased = yearPurchased;
        this.productPrice = productPrice;
    }
    public String toString(){
        String output = new String();
        output = "User profile #" + profileNumber + "\n Screen Name: " + screenName +
                 "\n User Name: " + userName +
                 "\n Year of Purchase: " + yearPurchased +
                 "\n Price of Product Purchased: $" + productPrice;
                 
        return output;
    }
}
