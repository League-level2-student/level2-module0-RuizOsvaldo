package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot[] robo = new Robot[5];
	//3. use a for loop to initialize the robots.
	for(int i = 0; i < robo.length; i++) {
		robo[i] = new Robot();
		
	
		//4. make each robot start at the bottom of the screen, side by side, facing up
		robo[i].setX(100 + i * 175);
		robo[i].setY(300);
		robo[i].setSpeed(100);
	}	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean notFinished = true;
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	while(notFinished) {
		for(int i = 0; i < robo.length; i++) {
			
			if(notFinished) {
				robo[i].move(new Random().nextInt(30));
				if(robo[i].getY() < 10) {
					notFinished = false;
					System.out.println("Winner is Robot " + (i + 1) );
				}
			}
		}
	}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}