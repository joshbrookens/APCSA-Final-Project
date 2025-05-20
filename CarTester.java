/* CarTester is front end of the program
* Contains user input and calls methods to make game run 
*/ @Author - Josh Brookens Project - Steer Car APCSA FINAL PROJECT End Date - 5/8/2025/

import java.util.Scanner; // imports ability to have keyboard input
import java.util.ArrayList; // imports ability to have arrayLists
public class CarTester
{
    public static void main(String[] args)
    {
    //Since variables are used in a while loop, all variables have to be initialized prior
        String name;
        int vehicleNum;
        boolean play = true;
        
        Scanner input = new Scanner(System.in);
        Scanner inputx = new Scanner(System.in);
        
        RaceCar vehicle; // RaceCar object
        State state;   // State object
        
         ArrayList<String> namesList = new ArrayList<>();
         ArrayList<Double> scoreList = new ArrayList<>();
         String information  = "SteerCar is a game meant to test your ability to measure time. After typing your name, you will select your vehicle. Choosing a car will increase the speed of the game as well as increase your allowed margin of error. Choosing a truck will give you more time to react as well as decrease your allowed margin of error. Choosing a truck will give you more points. After choosing your vehicle, the game will begin. You will either hit the A key to go left or D key to go right in the specified amount of seconds. Based on how close you are to the target amount, you get more points. If you are outside the margin of error (250ms for trucks and 500 ms for cars) the game is over. If you hit the wrong key the game is over. Once the game is over you can either play again by typing 'y' or 'yes' or type anything else to end the game and show the scores of each player/round. Once you end the program, all names and scores are deleted. Remaining idle for a long period of time stops the program.    ";
         
         
            System.out.println("Welcome to SteerCar. Hit the I key for game Information. Hit any other key to continue.");
            String intro = input.nextLine();
            if(intro.equalsIgnoreCase("I")){
            
        
            for (int i = 0; i<information.length()-1; i++){
                System.out.print(information.substring(i,i+1));
             try {
            // Adding a .04-second delay (25 milliseconds) between characters
            Thread.sleep(40);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
           
            }
            
            
        
            }else{
                System.out.println("Have fun and good luck.");
            }
        while (play){
            System.out.println("Hello! What is your name?");
            name = inputx.nextLine();
            namesList.add(name);
            System.out.println("Would you like a 1. Ram 1500 or a 2. Pagani Huayra? Select 1. or 2.");
            vehicleNum = input.nextInt();
     
            if(vehicleNum == 1){
                System.out.println("You have selected a truck");
                vehicle = new Truck(name);
            }
            else {
                System.out.println("You have selected a car");
                vehicle = new Car(name);
            }
    
            state = new State(vehicle);
            
            state.countDown(3); // runs countdown method
            
            state.playGame(); // runs playGame method
            scoreList.add(state.getScore()); // gets score of the game
            System.out.println("You have survived "+state.getRounds()+" rounds.");
           state.setRounds(-1); // clears number of rounds played
            System.out.println("Would you like to play again?");
            String response = inputx.nextLine();
                if(response.equalsIgnoreCase("y")||response.equalsIgnoreCase("yes")){
                    play = true;
                    
                    state.keepPlaying();
                    
                }
               else{
                   System.out.println("Players:");
                        for(String word: namesList)
                        {
                            System.out.print(word + " "); //for each player, print their name
                        }
                        System.out.println();
                        for(double num: scoreList)
                        {
                            System.out.print(num + " "); //for each score, print the score
                        }
                        System.out.println("THANKS FOR PLAYING STEER CAR");
                        
                   play = false;
               }
        }
        input.close();
        inputx.close(); // closes the scanners
      
    }   
}
