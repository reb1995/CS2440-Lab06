package solution;
/**
 * Class for Zoo.
 * @version 1.0
 * @author Ryan
 */
public class Lion extends Feline 
{	
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
	
	
    public Lion(Zoo zoo, String string) 
    {
	super(zoo, string);
    }
    
    /**
     * Empty for Checkstyle!.
     */
    public void makeNoise() 
    {
    	System.out.println("roar");
    }
    /**
     * Empty for Checkstyle!.
     */
    public void eat() 
    {
    	System.out.println("rip with teeth...");
    	setHungerLevel(getHungerLevel() - 2);
		//decrease hunger by 2
    }

}
