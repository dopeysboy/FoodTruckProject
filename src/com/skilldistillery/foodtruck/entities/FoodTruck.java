package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	//int used to automatically assign a unique ID to each FoodTruck object
	private static int truckIDCounter = 0;
	private int truckID;
	private String foodType;
	private String name;
	private int rating;
	
	public FoodTruck(String foodType, String name, int rating) {
		this.foodType = foodType;
		this.name = name;
		this.rating = rating;
		this.truckID = truckIDCounter;
		truckIDCounter++;
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
