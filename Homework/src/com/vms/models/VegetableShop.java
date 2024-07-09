package com.vms.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VegetableShop {

	public static void main(String[] args) throws IOException {

		// For the time being, we will be using a list to store the vegetable data.
		List<Vegetable> stockList = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int choice = -1;
		while (choice != 0) {
			// Display options
			System.out.println("Enter a command:");
			System.out.println("1. Add new vegetable");
			System.out.println("2. Update vegetable stock");
			System.out.println("3. Search vegetable");

			// Read the customer input
			choice = Integer.parseInt(reader.readLine());

			switch (choice) {
			case 1:
				System.out.println("Enter vegetable name:");
				String name = reader.readLine();
				
				System.out.println("Enter price per unit:");
				double price = Double.parseDouble(reader.readLine());

				System.out.println("Choose vegetable type: \n1. Leaf\n2. Root\n3. Fruit");
				String category = VegetableTypes.values()[Integer.parseInt(reader.readLine())-1].toString();

				// We can apply factory pattern to create different kinds of vegetables.
				// Encapsulating the object creation will make it more flexible.
				switch (category) {
				case "LEAF":
					System.out.println("Enter shelf life(in days):");
					int shelfLife = Integer.parseInt(reader.readLine());
					// We can use a singleton object or a utility class for ID generation.
					stockList.add(new LeafyVegetables(String.valueOf(stockList.size() + 1), name, category, price, shelfLife));
					break;

				case "ROOT":
					System.out.println("Enter soil type:");
					String soilType = reader.readLine();
					stockList.add(new RootVegetables(String.valueOf(stockList.size() + 1), name, category, price, soilType));
					break;

				case "FRUIT":
					System.out.println("Enter season:");
					String season = reader.readLine();
					stockList.add(new FruitVegetables(String.valueOf(stockList.size() + 1), name, category, price, season));
					break;

				}
				break;
			case 2:
				System.out.println("Enter vegetable ID:");
				String vegetableID = reader.readLine();
				
				System.out.println("Enter quantity:");
				int quantity =  Integer.parseInt(reader.readLine());
				
				for(int i=0;i<stockList.size();i++) {
					if(stockList.get(i).getVegetableId().equals(vegetableID)) {
						stockList.get(i).setQuantityInStock(quantity);
					}
				}
			}
			
		}
		reader.close();
	}
}
