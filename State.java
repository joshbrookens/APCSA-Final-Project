import java.util.Scanner;

public class State {
   // public static void main(String[] args) {
       boolean yes = true; // boolean to keep playing
       
       RaceCar vehicle;
       
       int randLR; // randomly chooses left or right
       int randTime; // randomly chooses time from 500 to 2000 mSec
       int simpleTime; // rounds randTime down to a quarter of a second
       double simpleTime2; // presents randTime in seconds
       long startTime; // records start time
       long endTime; //records end time
       String userInput; // user input
       long time; // time taken for user to respond
       double points; // points scored
       double score; // total score
       double timeSec; // time taken in seconds
       String secondString; // time taken in seconds as a string
       int whileLoopCount = -1; // number of rounds played
       
        Scanner scanner = new Scanner(System.in);
        
        // Constructor for the State class
        public State(RaceCar vehicle){
        this.vehicle=vehicle; 
            }
        
            //Player chooses to play again
        public void keepPlaying(){
            yes = true;
            score = 0;
            
        }
        
        
            
        
        // Prompt the user to start
        public void playGame(){
            while(yes){
                whileLoopCount++;
                //this randomly chooses 1 or 2 ie. left or right
                randLR = (int)(Math.random()*2+1);
                //this randomly chooses a number between 500 and 2000 mSec for car
                //and 1000 and 4000 mSec for truck
                randTime = (int)(Math.random()*vehicle.getSpeed()*1500+vehicle.getSpeed()*500);
                //this rounds randTime down to a quarter of a second
                simpleTime = (int)(randTime/250);
                // this presents randTime in seconds
                simpleTime2 = (double)(simpleTime/4.0);
                
                if(randLR == 1){ // if randLR is 1, go left
                    System.out.println(vehicle.getName()+", Go left(A) in "+simpleTime2+ " seconds:");
            
                    // Record the start time
                    startTime = System.currentTimeMillis();
                    
                    // Get user input
                    userInput = scanner.nextLine();
            
                    // Record the end time
                    endTime = System.currentTimeMillis();
                    // Check if the user pressed 'A'
                    if (userInput.equalsIgnoreCase("A")) {
                        yes = true;
                    } else {
                        System.out.println("Game Over.");
                        yes = false;
                    }
            
                    // Calculate the time taken
                    time = (endTime - startTime);
                    if(yes == true){
                        if(time < (simpleTime2*1000)+vehicle.getThreshold() && time > (simpleTime2*1000)-vehicle.getThreshold()){
                                yes = true;   //game keeps going if within threshold
                        }
                        else{
                            System.out.println("Game Over.");
                            yes = false; // game over if not within threshold
                        }
                    }
                    else{
                        System.out.println("You are a terrible driver. Remember to hit either A or D"); // user didn't press the right key
                    }
                    timeSec = time/1000.0;
                    secondString = String.valueOf(timeSec);
                    System.out.println("You took " + secondString + " seconds to turn left.");
                }else{ // if randLR is 2, go right
                    System.out.println(vehicle.getName()+", Go right(D) in "+simpleTime2+" seconds:");
            
                    // Record the start time
                    startTime = System.currentTimeMillis();
                    
                    // Get user input
                    userInput = scanner.nextLine();
            
                    // Record the end time
                    endTime = System.currentTimeMillis();
                    // Check if the user pressed 'D'
                    if (userInput.equalsIgnoreCase("D")) {
                        yes = true;
                    } else {
                        System.out.println("Game Over.");
                        yes = false;
                    }
            
                    // Calculate the time taken
                    time = (endTime - startTime);
                    if(yes == true){
                        if(time < (simpleTime2*1000)+vehicle.getThreshold() && time > (simpleTime2*1000)-vehicle.getThreshold()){
                                yes = true;     //game keeps going if within threshold
                        }
                        else{
                            System.out.println("Game Over.");
                            yes = false; // game over if not within threshold
                        }
                    }
                    else{
                        System.out.println("Remember to hit A to go left, D to go right."); // user didn't press the right key
                    }
                timeSec = time/1000.0;
                    secondString = String.valueOf(timeSec);
                    System.out.println("You took " + secondString + " seconds to turn right.");
                }
                if(vehicle.getSpeed()==2){// if the vehicle is a truck
                points = 1.75*(500 - (double)(Math.abs(time-(simpleTime2*1000)))); // trucks get 1.75 points for every millisecond they are within the threshold
                }else{ // vehicle is a car  
                points = 500 - (double)(Math.abs(time-(simpleTime2*1000))); // cars get 1 point for every millisecond they are within the threshold
                }
                System.out.println("Score: "+points); // print the score for this round
                score += points;
                System.out.println("Total Score: "+score); // print the total score
                 System.out.println();
            }
            
        }
        
        // This method is used to get the score of the game
    public double getScore(){
        return score;
    }
        // clears number of rounds played
    public void setRounds(int rounds){
        whileLoopCount = rounds;
    }
        // This method is used to get the number of rounds played
    public int getRounds(){
        return whileLoopCount;
    }
        
        
        
        //recursive method of 3 2 1 Go
    public void countDown(int x)
    {
        for(int i = 0; i< 60; i++){
            System.out.println();
        }
       // Base case - return GO!
       if(x < 1){
            System.out.println("GO!");
            
        }else{
            System.out.println(x);
        // This is the recursive call
        try {
            // Adding a 1-second delay (1000 milliseconds)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    	countDown(x - 1);
        }
 
    }
}