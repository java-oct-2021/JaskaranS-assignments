public class Mammal
{
    //class fields or members
    public int energylevel;

    //Constructor
    Mammal(int energylevel)
    {
        this.energylevel=energylevel;
    }
    
    //Method
    public void displayenergy()
    {
        System.out.println("Energy Level :"+ energylevel);
    }
}