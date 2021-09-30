public class Puzzletest {
    public static void main(String[] args) {
        PuzzleJava tester=new PuzzleJava();
        System.out.println(tester.generate_array());
        System.out.println("Random Letter -: "+ tester.generate_random_letter());
        System.out.println("Random Password is "+ tester.generate_random_password());
        tester.generate_random_passwordarray(2);
        int[]arr={1,2,3,4,5};
        tester.shuffle_array(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
