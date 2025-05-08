public abstract class RaceCar {
    private String name;
    public int threshold;
    //constructor of the raceCar class
    public RaceCar(String namex) {
       name = namex; // subClasses share the same name of the driver
    }
    
    public abstract int getSpeed();
    public abstract int getThreshold();
    
    public String getName() {
        return name;
    }
}