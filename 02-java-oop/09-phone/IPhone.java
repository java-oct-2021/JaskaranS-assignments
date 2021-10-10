public class IPhone extends Phone implements Ringable 
{
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) 
    {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return "Hello your IPhone is ringing";
    }
    @Override
    public String unlock() {
        // your code here
        return "Your Iphone is unlock now";
    }
    @Override
    public void displayInfo() {
        // your code here  
        System.out.println("Welcome to Apple IPhone");
    }
    
}
