/* Truck class is child class of RaceCar class
* speed and threshold variables are different from Car class
*/ @Author - Josh Brookens Project - Steer Car APCSA FINAL PROJECT End Date - 5/8/2025/
public class Truck extends RaceCar {
    private int speed;
    private int threshold;
    /*constructor of the Truck class*/
        public Truck (String name){
            super(name);
            speed = 2; // speed is half of a car's speed, so truck has twice as much reaction time
            threshold = 250; // This is 250 milliseconds is an acceptable margin of error is
        }
        /* Used in state to identify vehicle as truck or car. @ return speed
        */
        public int getSpeed(){
            return speed;
        }
          /* Used in state to calculate whether the person turned within the threshold of time. @ return threshold
    */
        public int getThreshold(){
            return threshold;
        }
        
}
