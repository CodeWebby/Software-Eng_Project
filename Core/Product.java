package Core;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Product {
	private static String colour;
	private static String description;
	private static String productName;
	private static String productType;
	private static Float costPrice;
	private static Float sellingPrice;
	private static int quantity;
	private static String modelNumber;
	private static String imageName;
	private static final ArrayList <Product> products = new ArrayList<>();


	private Product(String modelNumber, String productName, String productType, String description, Float costPrice, Float sellingPrice, int quantity, String imageName, String colour) {

		Product.modelNumber = modelNumber;
		Product.productName = productName;
		Product.productType = productType;
		Product.description = description;
		Product.costPrice = costPrice;
		Product.sellingPrice = sellingPrice;
		Product.quantity = quantity;
		Product.imageName = imageName;
		Product.colour = colour;


	}
	public static void createProduct(){

		Scanner read = new Scanner(System.in);
		System.out.println("Enter the model number of the product.");
		modelNumber = read.nextLine() ;
		System.out.println("Enter the name of the product.");
		productName = read.nextLine() ;
		System.out.println("Enter the type of the product.");
		productType = read.nextLine() ;
		System.out.println("Enter the description of the product.");
		description = read.nextLine() ;
		System.out.println("Enter the cost price of the product.");
		costPrice = read.nextFloat() ;
		System.out.println("Enter the selling price of the product.");
		sellingPrice = read.nextFloat() ;
		System.out.println("Enter the quantity of the product.");
		quantity = read.nextInt() ;
		System.out.println("Enter the colour  of the product.");
		colour = read.nextLine() ;

		Product e = new Product(modelNumber, productName, productType, description, costPrice, sellingPrice, quantity, imageName, colour);
		products.add(e);

	}
	public static void viewProduct(){
		print();
	}

	public static void editProduct() {
		String choice = null;
		Scanner scan = new Scanner(System.in);
		for (Product a : products) {
			System.out.println(a);
		}
		System.out.println("Enter the model number of the product you want to edit: ");
		String model = scan.nextLine();
		for (Product a : products) {
			//noinspection EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes
			if (a.equals(model)) {
				System.out.println(a);
				System.out.println("Command Options: ");
				System.out.println("m: model number");
				System.out.println("N: Product Name");
				System.out.println("t: Type of product");
				System.out.println("d: Description");
				System.out.println("C: Cost price");
				System.out.println("s: Selling price");
				System.out.println("Q: Edit quantity");
				System.out.println("c: Edit colour of product");
				System.out.println("I: Edit Photo");
				System.out.println("q: Quit");

				choice = scan.nextLine();
			}
			do {

				switch (Objects.requireNonNull(choice)) {
					case "m":
						a.setModelNumber(getModelNumber());
						break;
					case "N":
						a.setProductName(getProductName());
						break;
					case "t":
						a.setProductType(getProductType());
						break;
					case "d":
						a.setDescription(getDescription());
						break;
					case "C":
						a.setCostPrice(a.getCostPrice());
						break;
					case "s":
						a.setSellingPrice(getSellingPrice());
						break;
					case "Q":
						a.setQuantity(getQuantity());
						break;
					case "c":
						a.setColour(getColour());
						break;
					case "I":
						a.setImageName(a.getImageName());
						break;

				} // end of switch
			} while (!choice.equals("q"));


		}
	}



	public static void  deleteProduct() {
		System.out.println("Enter the model number of the product you want to remove.");
		Scanner read = new Scanner(System.in);
		String delete = read.nextLine();
		for (Product e : products) {
			//noinspection EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes
			if ( e.equals(delete)) {
				products.remove(e);
				System.out.println("Product deleted");

			} else{
				System.out.println( "Product not found!");
			}
		}
	}


	private float getCostPrice() {
		return costPrice;
	}

	private static float getSellingPrice() {
		return sellingPrice;
	}

	private static int getQuantity() {
		return quantity;
	}

	private static String getProductName() {
		return productName;
	}

	private void setModelNumber(String modelNumber) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the model number (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new model number.");
			Product.modelNumber = scan.nextLine();
		}else {
			System.out.println(modelNumber);
		}
	}

	private void setProductName(String productName) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the name (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")){
			System.out.println("Enter the new name.");
			Product.productName = scan.nextLine();
		}else{
			System.out.println(productName);
		}

	}

	private void setProductType(String productType) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the type of product (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new type.");
			Product.productType = scan.nextLine();
		}else {
			System.out.println(productType);
		}
	}

	private void setDescription(String description) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the description (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new description.");
			Product.description = scan.nextLine();
		}else {
			System.out.println(description);
		}
	}

	private void setCostPrice(Float costPrice) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the cost price (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new cost price.");
			Product.costPrice = scan.nextFloat();
		}else {
			System.out.println(costPrice);
		}
	}

	private void setSellingPrice(Float sellingPrice) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the selling price (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new selling price.");
			Product.sellingPrice = scan.nextFloat();
		}else {
			System.out.println(sellingPrice);
		}
	}

	private void setQuantity(int quantity) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the Quantity (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new Quantity.");
			Product.quantity = scan.nextInt();
		}else {
			System.out.println(quantity);
		}
	}

	private void setColour(String colour) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the colour (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new colour.");
			Product.colour = scan.nextLine();
		}else {
			System.out.println(colour);
		}
	}

	private void setImageName(String imageName) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the Image (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new Image name.");
			Product.imageName = scan.nextLine();
		}else {
			System.out.println(imageName);
		}

	}

	private static String getColour() {
		return colour;
	}

	private static String getModelNumber() {
		return modelNumber;
	}

	private static String getProductType() {
		return productType;
	}

	private static String getDescription() {
		return description;
	}
	private String getImageName(){
		return imageName;
	}
	private static String print(){
		return  "Brand Name:              " + getProductName() + "\n" +
				"Serial:                " + getModelNumber() + "\n" +
				"Product Type           " + getProductType()+"\n"+
				"Description:           " + getDescription()+ "\n" +
				"Colour                " + getColour() +"\n"+
				"Quantity:              " + getQuantity() + "\n" +
				"Selling Price          "+ getSellingPrice() + "\n"+
				"+++++++++++++++++++\n";
	}
}
