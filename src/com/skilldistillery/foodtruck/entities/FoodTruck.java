package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	//int used to automatically assign a unique ID to each FoodTruck object
	private static int truckIDCounter = 0;
	private int truckID;
	private String foodType;
	private String name;
	private int rating;
	
	public FoodTruck(String name, String foodType, int rating) {
		this.foodType = foodType;
		this.name = name;
		this.rating = rating;
		this.truckID = truckIDCounter;
		truckIDCounter++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Truck ID: ").append(truckID).append("Truck Name: ").append(name).append(" Cuisine: ").append(foodType).append(" Rating: ").append(rating);
		return sb.toString();
	}
	
	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
