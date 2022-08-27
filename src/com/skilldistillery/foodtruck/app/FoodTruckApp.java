package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public Scanner kb = new Scanner(System.in);
	
	//for usrInput() to know if the usr is sick of entering data
	public boolean keepGoing = true;
	//for menuLoop() to know to keep running
	public boolean menuLooping = true;
	
	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		
		FoodTruck truck1 = fta.usrInput();
		FoodTruck truck2 = fta.usrInput();
		FoodTruck truck3 = fta.usrInput();
		FoodTruck truck4 = fta.usrInput();
		FoodTruck truck5 = fta.usrInput();
		
		FoodTruck[] yelpList = fta.createArray(truck1, truck2, truck3, truck4, truck5);
		
		fta.listFoodTrucks(yelpList);
		
		fta.kb.close();
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
		StringBuilder sb = new StringBuilder();
		String dashes = "--------------------------------------";
		
		sb.append("                Menu\n");
		sb.append(dashes).append("\n");
		sb.append("1. (L)ist Existing Food Trucks\n");
		sb.append("2. (S)ee average rating\n");
		sb.append("3. (D)isplay highest rated food truck\n");
		sb.append("4. (Q)uit\n");
		sb.append(dashes);
		
		System.out.println(sb);
	}
	
	/**
	 * Given an array of FoodTrucks, returns the truck with the highest rating value
	 * @param FoodTruck[] trucks
	 * @return FoodTruck with the highest rating value
	 */
	public FoodTruck displayHighestRating(FoodTruck[] trucks) {
		FoodTruck highestTruck = trucks[0];
		int highestRating = trucks[0].getRating();
		
		for(int i = 1; i < trucks.length; i++) {
			if(trucks[i].getRating() > highestRating) {
				highestTruck = trucks[i];
				highestRating = trucks[i].getRating();
			}
		}
		return highestTruck;
	}
	
	/**
	 * Prompts the user for a FoodTruck's name, foodType, and rating
	 * @return FoodTruck made from user's input
	 */
	public FoodTruck usrInput() {
		if(keepGoing) {
			String[] usrInputArr = new String[3];
			String tempString;
			
			System.out.print("Please enter the food truck's name, or QUIT to stop entering information: ");
			tempString = kb.nextLine();
			
			if(tempString.equalsIgnoreCase("quit")) {
				keepGoing = false;
				kb.close();
				return null;
			} else {
				usrInputArr[0] = tempString;
			}
			
			System.out.print("Please enter the food truck's food type: ");
			usrInputArr[1] = kb.nextLine();
			
			System.out.print("Please enter your food rating for the truck: ");
			usrInputArr[2] = kb.nextLine();
			
			return makeFoodTruck(usrInputArr);
		} else {
			return null;
		}
	}
	
	/**
	 * Prints to console each FoodTruck in trucks
	 * @param trucks
	 */
	public void listFoodTrucks(FoodTruck[] trucks) {
		for(FoodTruck truck : trucks) {
			System.out.println(truck);
		}
	}
	
	/**
	 * Creates an array of FoodTruck objects, if any trucks are null, will not insert into the array
	 * @param n FoodTruck objects
	 * @return FoodTruck[] of size n
	 */
	public FoodTruck[] createArray(FoodTruck...trucks) {
		FoodTruck[] truckArr;
		int numTrucks = 0;
		
		for(int i = 0; i < trucks.length; i++) {
			if(trucks[i] != null) {
				numTrucks++;
			}
		}
		
		truckArr = new FoodTruck[numTrucks];
		numTrucks = 0;
		
		for(int i = 0; i < trucks.length; i++) {
			if(trucks[i] != null) {
				truckArr[numTrucks] = trucks[i];
				numTrucks++;
			}
		}
		
		return truckArr;
	}
	
	/**
	 * Creates a FoodTruck object made from a String[]
	 * @param String[] usrInput
	 * @return FoodTruck object made from usrInput 
	 */
	public FoodTruck makeFoodTruck(String[] usrInput) {
		String name = usrInput[0];
		String foodType = usrInput[1];
		int rating = Integer.parseInt(usrInput[2]);
		
		FoodTruck truck = new FoodTruck(name, foodType, rating);
		return truck;
	}
}
