public class PhoneTest {
    public static void main(String[] args) {
        IPhone iphonethirteen=new IPhone("13",100,"Verizon","Zing!!!");
        Galaxy s9=new Galaxy("9", 77,"T-Mobile", "Ring Ring Ring!!!!!");
        iphonethirteen.displayInfo();
        iphonethirteen.getRingTone();
        s9.getRingTone();
        s9.displayInfo();

    }
}
