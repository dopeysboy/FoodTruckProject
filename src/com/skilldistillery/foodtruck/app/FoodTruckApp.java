package com.skilldistillery.foodtruck.app;

import java.util.Scanner;
import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck[] yelpList;
	private FoodTruck truck1;
	private FoodTruck truck2;
	private FoodTruck truck3;
	private FoodTruck truck4;
	private FoodTruck truck5;
	
	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.usrInput();
	}
	
	/**
	 * Given a FoodTruck array, will return the average of their scores
	 * @param FoodTruck[] trucks
	 * @return double avg that is the average of all trucks' ratings 
	 */
	public double seeAvgRating(FoodTruck[] trucks) {
		double avg = 0d;
		
		return avg;
	}
	
	/**
	 * The main loop of the application, will quit when the user inputs 4 or quit
	 */
	public void menuLoop() {
		
	}
	
	/**
	 * Prints the menu screen to the console
	 */
	public void printMenu() {
		
	}
	
	/**
	 * Given an array of FoodTrucks, returns the truck with the highest rating value
	 * @param FoodTruck[] trucks
	 * @return FoodTruck with the highest rating value
	 */
	public FoodTruck displayHighestRating(FoodTruck[] trucks) {
		FoodTruck truck = null;
		
		return truck;
	}
	
	/**
	 * Prompts the user for a FoodTruck's name, foodType, and rating
	 * @return FoodTruck made from user's input
	 */
	public FoodTruck usrInput() {
		Scanner kb = new Scanner(System.in);
		String[] usrInputArr = new String[3];
		String tempString = null;
		
		System.out.print("Please enter the truck's name, or QUIT to stop entering information: ");
		tempString = kb.next();
		
		if(tempString.equalsIgnoreCase("quit")) {
			return null;
		}
		else {
			usrInputArr[0] = tempString;
		}
		
		System.out.println();
		System.out.print("Please enter the truck's food type: ");
		usrInputArr[1] = kb.next();
		
		System.out.println();
		System.out.print("Please enter your rating for the truck: ");
		usrInputArr[2] = kb.next();
		
		return makeFoodTruck(usrInputArr);
	}
	
	/**
	 * Prints to console each FoodTruck in trucks
	 * @param trucks
	 */
	public void listFoodTrucks(FoodTruck[] trucks) {
		
	}
	
	/**
	 * Creates an array of FoodTruck objects
	 * @param n FoodTruck objects
	 * @return FoodTruck[] of size n
	 */
	public FoodTruck[] createArray(FoodTruck...trucks) {
		FoodTruck[] truckArr = null;
		
		return truckArr;
	}
	
	/**
	 * Creates a FoodTruck object made from a String[]
	 * @param String[] usrInput
	 * @return FoodTruck object made from usrInput 
	 */
	public FoodTruck makeFoodTruck(String[] usrInput) {
		FoodTruck truck = null;
		
		return truck;
	}
}
