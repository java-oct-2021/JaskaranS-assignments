public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) 
    {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return "Hello Your Galaxy is ringing ";
    }
    @Override
    public String unlock() {
        // your code here
        return "Your Samsung Phone is Unlock";
    }
    @Override
    public void displayInfo() {
        // your code here    
    System.out.println("Welcome to the Samasung Galaxy");  
    }
    
}
