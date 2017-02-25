package solution;
/**
 * Empty for Checkstyle!.
 * @version 1
 * @author Ryan
 * 
 */

public abstract class Animal
{
    private Zoo zoo;
    
    private String animalName;

    private int hungerLevel = 0;
    
    /**
     * Empty for Checkstyle!.
     */
    public Animal()
    {
        
    }

    /**
     * Empty for Checkstyle!.
     * @param zoo zoo
     * @param name name
     */
    public Animal(Zoo zoo, String name)
    {
	super(zoo, string);
    	this.zoo = zoo;
    	//this.zoo.equals(zoo);
    	animalName = name;
    	//this.name.equals(name);
    	
    	setHungerLevel(0);
    }



    /**
     * Empty for Checkstyle!.
     * @return animalName name
     */

    public String getName()
    {
        return animalName;
    }  
    /**
     * Empty for Checkstyle!.
     * @param name name param
     */
    public void setName(String name)
    {
        animalName = name;
        //this.name.equals(name);
        
        
    }


    /**
     * Empty for Checkstyle!.
     * @return hungerLevel
     */
    public int getHungerLevel()
    {
        return hungerLevel;
    }
    /**
     * Empty for Checkstyle!.
     * @param hungerLevel haG
     */
    public void setHungerLevel(int hungerLevel)
    {

        if (hungerLevel > 10)
        {
            this.hungerLevel = 10;
        }
        else if (hungerLevel < 0)
        {
            this.hungerLevel = 0;
        }
        else 
        {
            this.hungerLevel = hungerLevel;
        }
    }


    /**
     * Empty for Checkstyle!.
     */

    public void sleep()
    {
    	System.out.println("sleeping...");
    	setHungerLevel(10);
    }

    /**
     * Empty for Checkstyle!.
     */

    public void roam()
    {   
        System.out.println("moving around...");
        setHungerLevel(getHungerLevel() + 1);
        
    }
    /**
     * Empty for Checkstyle!.
     */

    public abstract void makeNoise();

    /**
     * Empty for Checkstyle!.
     */
    public abstract void eat();
	
}
