import java.util.*;
class PuzzleJava
{
    //Creating an  instance of Random class
    Random rand_number=new Random(); 
    public int [] generate_array()
    {
        int [] arr=new int[10];
        for (int i=0;i<10;i++)
        {
            arr[i]=rand_number.nextInt(21);
            System.out.println("Element at "+ i +" is "+ arr[i]);
        }
        return arr;
    }
    //Generate random letter
    public char generate_random_letter()
    {
        char []arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int i=rand_number.nextInt(26);
        char letter=arr[i];
        return letter;
    }
    //Generate random password
    public String generate_random_password()
    {
        String password="";
        for(int i=0; i<8;i++)
        {
            password+=generate_random_letter();
        }
        return password;
    }
    // Generate Random new password set
    public void generate_random_passwordarray(int n)
    {
        String [] arr=new String[n];
        for (int i=0; i<arr.length;i++)
        {
            arr[i]=generate_random_password();
            System.out.println("random password "+ arr[i]);
        }
    }
    // SENSEI BONUS (Shuffle Array)
    public void shuffle_array(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int j=i+(int)(Math.random()*(arr.length-i));
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}