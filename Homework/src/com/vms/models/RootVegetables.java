package com.vms.models;

public class RootVegetables extends Vegetable{
	
	private String soilType;

	public RootVegetables(String vegetableId, String name, String category, double pricePerUnit, String soilType) {
		super(vegetableId, name, category, pricePerUnit);
		this.soilType = soilType;
	}
	
	@Override
	public String toString() {
		return String.format("%s Soil type: %s\n", super.toString(), this.soilType);
	}

}
