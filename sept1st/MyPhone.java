public class MyPhone{
 //1. create instance variables
    private int memoryCapacity; // in GB
    private double cost; // in dollars
    private String carrier;
    private boolean isWiFiOn;
 //2. write constructor to initialize variables
    public MyPhone(){
        memoryCapacity = 64;
        cost = 199.99;
        carrier = new String ("AT&T");
        isWiFiOn = false;
 
    }
    //setters and getters below
    public int getMemoryCapacity(){
        return memoryCapacity;
    } //endmthd
    
    public void setMemoryCapacity ( int memory ){
        this.memoryCapacity = memory;
    } //endmthd
    
    public MyPhone ( int memoryCapacity, double cost, String carrier, boolean isWiFiOn ){
        this.memoryCapacity = memoryCapacity;
        this.cost = cost;
        this.carrier = new String (carrier);
        this.isWiFiOn = isWiFiOn;
    }//end 4 argument consrtuctor
 //3. write toString() for printing
    public String toString(){
        String output = new String();
        output = "Memory Capacity is: " + memoryCapacity + "\n" +
                 "Cost is: " + cost + "\n" +
                 "Carrier is: " + carrier + "\n" +
                 "WiFi Status: " + isWiFiOn;
                 return output;
    }
    
    
    
 }