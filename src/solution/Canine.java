package solution;
/**
 * Dog Class.
 * @version 1.0
 * @author Ryan
 */

public abstract class Canine extends Animal  
{
	/**
	 * Class in Zoo.
	 * 
	 * @param zoo the zoo
	 * @param string the string
	 */
	
    public Canine(Zoo zoo, String string) 
    {
    	
    }
    /**
     * Empty for Checkstyle!.
     */
    public void roam() 
    {
        System.out.println("like canines roam in packs...");
        setHungerLevel(getHungerLevel() + 1);
    }


}
