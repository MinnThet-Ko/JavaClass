package com.vms.models;

public class FruitVegetables extends Vegetable{
	
	private String seasonality;

	public FruitVegetables(String vegetableId, String name, String category, double pricePerUnit,String seasonality) {
		super(vegetableId, name, category, pricePerUnit);
		this.seasonality = seasonality;
	}

	
	@Override
	public String toString() {
		return String.format("%s Seasonality: %s\n", super.toString(), this.seasonality);
	}

}
