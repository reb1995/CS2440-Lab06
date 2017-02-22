package solution;
/**
 * Dog Class.
 * @version 1.0
 * @author Ryan
 */

public class Dog extends Canine implements Pet 
{

	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */


    public Dog(Zoo zoo, String string) 
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
    }

    /**
     * Empty for Checkstyle!.
     */

    /**
     * Empty for Checkstyle!.
     */
    public void play() 
    {
        System.out.println("frolic…");
    }
    /**
     * Empty for Checkstyle!.
     */
    public void beFriendly() 
    {
        System.out.println("purr…");
    }
	
	

}
