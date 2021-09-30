import java.util.*;
class BasicJava
{
    //Print 1 to 255 using array 
    public int[] print255()
    {
        int first_array[]=new int[255];
        for (int i=0;i<255;i++)
        {
            first_array[i]=i+1;
        }
        for (int i=0;i<255;i++)
        {
            System.out.println(first_array[i]);
        }
        return first_array;
    }
    //------ARRAY LIST -------/
    public void all()
    {
        ArrayList<Integer>myArray=new ArrayList<Integer>();
        for(int i=0; i<=255;i++)
        {
            myArray.add(i);
        }
        for(int i=0; i<myArray.size();i++)
        {
            System.out.println(myArray.get(i));
        }
    }
    //Print all the odd numbers between 1 to 255 using array
    public int[] odd()
    {
        int first_array[]=new int[255];
        for (int i=0;i<255;i++)
        {
            first_array[i]=i+1;
        }
        for (int i=0;i<255;i++)
        {
            if (first_array[i]%2==0)
            {
            System.out.println(first_array[i]);
            }
        }
        return first_array;
    }
    //Printing sum of 1-255 
    public int sum()
    {
        int sum=0;
        for (int i=0;i<=255;i++)
        {
            sum+=i;
        }
        return sum;
    }
    //Printing each value of array
    public void value()
    {
        int []x={1,3,5,7,9,13};
        for (int i=0; i<x.length;i++)
        {
            System.out.println("Element of array at index "+ i + " is " +x[i]);
        }
    }
    //Find max value
    public int max()
    {
        int [] arr={-3,-5,-7};
        int max_value=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>=max_value)
            {
                max_value=arr[i];
            }
        }
        return max_value;
    }
    // printing array with odd numbers using Array List
    public void all_odd()
    {
        ArrayList<Integer>myArray=new ArrayList<Integer>();
        for(int i=0; i<=255;i++)
        {
            myArray.add(i);
        }
        for(int i=0; i<myArray.size();i++)
        {
            if(myArray.get(i)%2!=0)
            {
            System.out.println(myArray.get(i));
            }
        }
    }
    //Printing Average of the array
    public int average(int[]arr)
    {
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println(sum);
        return sum/arr.length;
    }
    //counting the values which are greater than y in array
    public int counting(int []arr,int y)
    {
        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]>y)
            {
                count+=1;
            }
        }
        return count;
    }
    //Square the Values
    public void all_square()
    {
        int [] arr={1,5,10,-2};
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Square of "+ arr[i]+" is "+arr[i]*arr[i]);
        }
    }
    //Remove Negative values
    public void remove_negative()
    {
        int [] arr={1,5,10,-2};
        ArrayList<Integer>myarr=new ArrayList<Integer>(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>0)
            {
                myarr.add(arr[i]);
            }
        }
        for(int i=0;i<myarr.size();i++)
        {
            System.out.println(myarr.get(i));    
        }
    } 
}