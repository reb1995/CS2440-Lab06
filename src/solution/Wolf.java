package solution;

/**
 * Wolf Class.
 * @version 1.0
 * @author Ryan
 */
public class Wolf extends Canine
{
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
    public Wolf(Zoo zoo, String string) 
    {
	super(zoo, string);
    }

    /**
     * Empty for Checkstyle!.
     */
    public void makeNoise() 
    {
    	System.out.println("growl...");
    }
    
    
    /**
     * Empty for Checkstyle!.
     */	
    public void eat() 
    {
    	System.out.println("rip with teeth...");

    	setHungerLevel(getHungerLevel() - 2);
		// decrease hunger by two
		
    }
	
	

}
