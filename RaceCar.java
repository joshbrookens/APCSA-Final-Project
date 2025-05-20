/* RaceCar class is parent class of Car and Truck classes
*/ @Author - Josh Brookens Project - Steer Car APCSA FINAL PROJECT End Date - 5/8/2025/
    
public abstract class RaceCar {
    private String name;
    public int threshold;
    /*constructor of the raceCar class*/
    public RaceCar(String namex) {
       name = namex; // subClasses share the same name of the driver
    }
    
    public abstract int getSpeed();
    public abstract int getThreshold();

    /* retrieves users imput for name @ return name
    */
    public String getName() {
        return name;
    }
}
