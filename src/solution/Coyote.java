package solution;

/**
 * Class for Zoo.
 * @version 1.0
 * @author Ryan
 */
public class Coyote extends Canine 
{
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
	
    public Coyote(Zoo zoo, String string) 
    {
	super(zoo, string);
    }

    /**
     * Empty for Checkstyle!.
     */

    public void makeNoise() 
    {
    	System.out.println("howl...");
    }
    /**
     * Empty for Checkstyle!.
     */

    public void eat() 
    {
    	System.out.println("gnaws");
    	setHungerLevel(getHungerLevel() - 2);
		//decrease hunger by 2 units.
    }

}
