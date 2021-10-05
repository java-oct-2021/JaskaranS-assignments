class Project
{
    private String name;
    private String description;

    public Project()
    {
        //Constructor without parameters 
    }
    public Project(String name)
    {
        //Constructor with 1 parameter
        this.name=name; 
    }

    public Project(String name, String description)
    {
        //Constructor with 2 parameters
        this.name=name;
        this.description=description;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setdescription(String description)
    {
        this.description=description;
    }
    public String getname()
    {
        return name;
    }
    public String getdescription()
    {
        return description;
    }
    public String eleveatorPitch()
    {
        return getname()+" : "+getdescription();
    }

}