package solution;
/**
 * Dog Class.
 * @version 1.0
 * @author Ryan
 */

public class Hippo extends Animal 
{
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */

    public Hippo(Zoo zoo, String string) 
    {
    	super(zoo, string);
    }

    /**
     * Empty for Checkstyle!.
     */
    public void makeNoise() 
    {
        System.out.println("blub...");
    }
    /**
     * Empty for Checkstyle!.
     */
    public void eat() 
    {
        System.out.println("slurp...");

        setHungerLevel(getHungerLevel() - 1);
		//decrease hunger by 1
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
