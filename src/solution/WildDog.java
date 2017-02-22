package solution;
/**
 * Wild Dog Class.
 * @version 1.0
 * @author Ryan
 */

public class WildDog extends Canine
{

	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
    public WildDog(Zoo zoo, String string) 
    {
		super(zoo, string);
    }


    /**
     * Empty for Checkstyle!.
     */
    public void makeNoise() 
    {
        System.out.println("bark...");
    }
    /**
     * Empty for Checkstyle!.
     */

    public void eat() 
    {
        System.out.println("slop...");
        setHungerLevel(getHungerLevel() - 3);
		//decrease hunger by 3 units.
    }

}
