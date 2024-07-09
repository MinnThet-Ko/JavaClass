package com.vms.models;

public class LeafyVegetables extends Vegetable{
	
	private int shelfLife;

	public LeafyVegetables(String vegetableId, String name, String category, double pricePerUnit, int shelfLife) {
		super(vegetableId, name, category, pricePerUnit);
		this.shelfLife = shelfLife;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	
	@Override
	public String toString() {
		return String.format("%s Shelf life: %d\n", super.toString(), this.shelfLife);
	}

}
