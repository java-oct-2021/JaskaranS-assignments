public class Mammal
{
    //class fields or members
    protected int energylevel;

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