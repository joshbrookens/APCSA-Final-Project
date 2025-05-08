# APCSA-Final-Project
SteerCar is a game meant to test your ability to measure time. 
## Getting Started

/*Author - Josh Brookens
Project - Steer Car APCSA FINAL PROJECT
End Date - 5/8/2025*/

SteerCar is a game meant to test your ability to measure time. After typing your name, you will select your vehicle. Choosing a car will increase the speed of the game as well as increase your allowed margin of error. Choosing a truck will give you more time to react as well as decrease your allowed margin of error. Choosing a truck will give you more points. After choosing your vehicle, the game will begin. You will either hit the A key to go left or D key to go right in the specified amount of seconds. Based on how close you are to the target amount, you get more points. If you are outside the margin of error (250ms for trucks and 500 ms for cars) the game is over. If you hit the wrong key the game is over. Once the game is over you can either play again by typing 'y' or 'yes' or type anything else to end the game and show the scores of each player/round. Once you end the program, all names and scores are deleted. Remaining idle for a long period of time stops the program. 

The CarTester class runs the main method of the program where the user interacts with a scanner.
The State class runs the classes that make up the core of the game, most notably the playGame() method, which is a void method that runs a while loop which plays the game. Supplementary helper methods are also present such as getScore(), setRounds(), and getRounds(). countdown() is a recursive method to give the user a 3 sec countdown keepPlaying() allows the player to go again
The RaceCar class is a parent class for Car and Truck classes. It returns the name, since it is one value that both Car and Truck share
The Truck class is a child class which returns a speed and threshold value different from car
The Car class is a child class which returns a speed and threshold value different from truck






