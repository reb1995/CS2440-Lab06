package solution;

/**
 * Class for Zoo.
 * @version 1.0
 * @author Ryan
 */
public class FeralCat extends Feline
{
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
    public FeralCat(Zoo zoo, String string) 
    {
		super(zoo, string);
    }


    /**
     * Empty for Checkstyle!.
     */
    public void makeNoise() 
    {
    	System.out.println("meow...");
    }
    /**
     * Empty for Checkstyle!.
     */
    public void eat() 
    {
    	System.out.println("pick...");
    	setHungerLevel(getHungerLevel() - 3);
		// decrease hunger by 3
    }

}
