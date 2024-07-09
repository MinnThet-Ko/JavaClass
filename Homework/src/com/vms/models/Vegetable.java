package com.vms.models;

public class Vegetable {
	
	private String vegetableId;
	private String name;
	private String category;
	private double pricePerUnit;
	private int quantityInStock;
	
	public Vegetable(String vegetableId, String name, String category, double pricePerUnit) {
		this.vegetableId = vegetableId;
		this.name = name;
		this.category = category;
		this.pricePerUnit = pricePerUnit;
	}

	public String getVegetableId() {
		return vegetableId;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	
	@Override
	public String toString() {
		return String.format("ID: %s\nName: %s\nPrice: %n\nQuantity in stock: %d\n", this.vegetableId, this.name, this.pricePerUnit, this.quantityInStock);
	}
	
}
