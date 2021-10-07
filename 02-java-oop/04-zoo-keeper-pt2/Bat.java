import javax.lang.model.util.ElementScanner6;

public class Bat extends Mammal 
{

    Bat(int energylevel)
    {
        super(energylevel);
    }
    public void fly()
    {   
        if (energylevel>0)
        {
        System.out.println("---Taking off---");
        this.energylevel-=50;
        displayenergy();
        }
        else
        {
            System.out.println("Low Energy");
        }
    }
    public void eatHumans()
    {
        System.out.println("---Eating Humans---");
        this.energylevel+=25;
        displayenergy();
    }
    public void attackTown()
    {
        System.out.println("---Town on Fire---");
        energylevel-=100;
        displayenergy();
    }
}
