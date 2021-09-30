public class BasicTest {
    public static void main(String[] args) {
        BasicJava tester=new BasicJava();
        System.out.println(tester.print255());
        System.out.println(tester.odd());
        tester.all();
        tester.value();
        System.out.println(tester.max());
        tester.all_odd();
        int [] arr={2,10,3};
        System.out.println("Average is "+tester.average(arr));
        int [] arr1={1,3,5,7};
        System.out.println("Total "+tester.counting(arr1, 1));
        tester.all_square();
        tester.remove_negative();
    }
    
}
