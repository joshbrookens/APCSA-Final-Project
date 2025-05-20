/* Car class is child class of RaceCar class
* speed and threshold variables are different from Truck class
*/ @Author - Josh Brookens Project - Steer Car APCSA FINAL PROJECT End Date - 5/8/2025/
    
public class Car extends RaceCar{
    private int speed;
    private int threshold;
    
         public Car (String name){
             super(name);
             speed = 1; // speed is twice of a truck's speed, so car has half as much reaction time
             threshold = 500;// This is 500 milliseconds is an acceptable margin of error
         }
         /* Used in state to identify vehicle as truck or car. @return speed
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
