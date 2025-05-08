package myfirstjob;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product product = new product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter The number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product); 
		
		System.out.println();
		System.out.println("Enter The number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product); 
		

		
	
		
		
		sc.close();
	}
	

}
