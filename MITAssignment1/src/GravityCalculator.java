/**
 * 
 */

/**
 * @author Moses
 * MIT Assignment 1
 * Program that computes the distance an object will fall in Earth's gravity
 *
 */
public class GravityCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double gravity = -9.81; // Earth's gravity in m/s^2
		@SuppressWarnings("unused")
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		@SuppressWarnings("unused")
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		finalPosition = 0.5 * gravity * fallingTime * fallingTime;
		
		
		 System.out.println("The object's position after " + fallingTime +
		" seconds is " + finalPosition + " m.");
		 
		 
		 
		 
		
	}

}
