//Child Class extends Parent class
public class Gorilla extends Mammal
{
    //Constructor of Child Class
    public Gorilla(int energylevel)
    {
        //Super Keyword 
        super(energylevel);
    }
    //Methods of Child Class
    public void throwSomething()
    {
        System.out.println("***Throwing Things at people***");
        this.energylevel-=5;
        displayenergy();
    }
    public void eatBananas()
    {
        System.out.println("***More Energy***");
        this.energylevel+=10;
        displayenergy();
    }
    public void climb()
    {
        System.out.println("***Climbing***");
        this.energylevel-=10;
        displayenergy();
    }

}