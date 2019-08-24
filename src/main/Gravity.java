/*
 * @author Mukul Agrawal
 * @version 1.0
 * */
package main;

import java.util.Scanner;


public class Gravity {

	public static void main(String[] args) {
		double speed;
		double distance;
		double time;
		double g=9.8;
		Scanner sc =new scanner(System.in);
		System.out.println("Enter the time");
		time=sc.nextDouble();
		speed=g*time;
		distance=0.5*g*time*time;
		System.out.println("speed"+speed)
		System.out.println("The speed of the object at "+time+" seconds after its release is "+speed+" and the distance the object has travelled in the "+time+" seconds after the relase is "+distance);
	}

}
