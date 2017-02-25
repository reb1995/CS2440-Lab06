package solution;
/**
 * Class for Zoo.
 * @version 1.0
 * @author Ryan
 */
public abstract class Feline extends Animal 
{

	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
	
    public Feline(Zoo zoo, String string) 
    {
    	super(zoo, string);
    }
    /**
     * Empty for Checkstyle!.
     */
    public void roam() 
    {
    	System.out.println("felines like to roam alone...");
    	setHungerLevel(getHungerLevel() + 1);
		// Increase the hunger level
    }

}
