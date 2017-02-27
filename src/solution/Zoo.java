package solution;
import java.util.ArrayList;

/**
 * Empty for Checkstyle!.
 * @version 1
 * @author Ryan
 * 
 */
public  class Zoo implements AnimalLocation
{
    private double latitude;
    private double longitude;
    private String name;
    private ArrayList<Animal> zooAnimals = new ArrayList<Animal>();
    
    
    /**
     * Empty for Checkstyle!.
     */
    public Zoo()
    {
    	
    }


    /**
     * Empty for Checkstyle!.
     * @param name name
     * @param lat lat
     * @param lon lon
     */
    public Zoo(String name, double lat, double lon)
    {
        setName(name);
    	setLatitude(lat);
    	setLongitude(lon);
    	
    }

    /**
     * Empty for Checkstyle!.
     * @return latitude
     */
    public double getLatitude()
    {
        return latitude;
    }
    
    
    /**
     * Empty for Checkstyle!.
     * @param latitude latitude
     */
    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
        if (latitude < 0)
        {
            this.latitude = 0;
        }
    	
    }

    /**
     * Empty for Checkstyle!.
     * @return longitude l
     */
    public double getLongitude()
    {
    	
        return longitude;
    }
    
    /**
     * Empty for Checkstyle!.
     * @param longitude lon
     */
    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
        if (longitude < 0)
        {
            this.longitude = 0;
        }
    	
    }
    
    
    /**
     * Empty for Checkstyle!.
     * @return name name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Empty for Checkstyle!.
     * @param name name
     */
    public void setName(String name)
    {
	this.name = name;
    }
    
    
    /**
     * Empty for Checkstyle!.
     * @return zooAnimals.size() size
     */
    public int getNumOfAnimals() 
    {
        return zooAnimals.size();
    }
    

    /**
     * Empty for Checkstyle!.
     * @param animal animal
     */
    public void addAnimal(Animal animal)
    {
    	zooAnimals.add(animal);	
    }


    /**
     * Empty for Checkstyle!.
     */
    public void testAnimals()
    {

        System.out.println("Name of the Zoo is: "  + ". The Longitude: " 
            + longitude + ". The Latitude: " + latitude 
            + ". The number of animals: " + zooAnimals.size());
	
	
		/**
		for(Animal animal : zooAnimals)
		{
			Animal.sleep();
			Animal.eat();
			Animal.makeNoise();
			Animal.roam();	
			
		} **/
		
        for (Animal a : zooAnimals)
        {
            System.out.println(a.getName());
            a.sleep();
            System.out.println(a.getName() + " is hungry!");
            a.makeNoise();
            a.eat();
            a.roam();
            if (a instanceof Pet)
            {
                ((Pet) a).play();
                ((Pet) a).beFriendly();
            }
            System.out.println();
        }
    }



    /**
     * Empty for Checkstyle!.
     * @param args args
     */

    public static void main(String[] args)
    {
        Zoo zoo = new Zoo("theZoo", 1, 2);
        Cat cat = new Cat(zoo, "Kitty the Cat");
        Coyote coyote = new Coyote(zoo, "Oat the Coy Coyote");
        Dog dog = new Dog(zoo, "Hog the Dog");
        FeralCat feralCat = new FeralCat(zoo, "Sherrell Nat the FeralCat");
        Hippo hippo = new Hippo(zoo, "Zippo the Hippo");
        Lion lion = new Lion(zoo, "Food the Lion");
        WildDog wildDog = new WildDog(zoo, "Pile of Smog the WildDog");
        Wolf wolf = new Wolf(zoo, "Wall Street the Wolf");
        
        zoo.addAnimal(cat);
        zoo.addAnimal(coyote);
        zoo.addAnimal(dog);
        zoo.addAnimal(feralCat);
        zoo.addAnimal(hippo);
        zoo.addAnimal(lion);
        zoo.addAnimal(wildDog);
        zoo.addAnimal(wolf);


    }


}
