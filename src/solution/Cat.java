package solution;
/**
 * Class for Zoo.
 * @version 1.0
 * @author Ryan
 */
public class Cat extends Feline implements Pet 
{
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */

    public Cat(Zoo zoo, String string) 
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
