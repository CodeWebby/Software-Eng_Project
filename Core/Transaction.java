package Core;

import java.util.ArrayList;
import java.util.Scanner;

import static Core.Product.products;


public class Transaction {


    private final String Date;
   private String payment = "Cash";
    private static final ArrayList<Transaction>transactions = new ArrayList<>();
    private static final ArrayList<String>product =new ArrayList<>();
	private final String id;

	private Transaction(){


    	Scanner scan = new Scanner(System.in);
		Date = DateUtil.today();
		System.out.println("Enter the payment method use: ");
		payment = scan.nextLine();
		System.out.println("Enter customer ID.");
		 id = scan.nextLine();
		System.out.println("Enter amount of products bought:");
		int Amount = scan.nextInt();
		for (int i=0;i<Amount;i++){
			for (Product p: products){
				Product.print();
				System.out.println("Enter the product model number");
				String model = scan.nextLine();
				if (p.equals(model)){
					product.add(Integer.parseInt(model), Product.getProductName());
				}

			}

		}

		for (Customer e : Customer.customers){
			if (e.equals(id)){
				transactions.add(new Transaction(id,Date));
			}
		}
	}

	private Transaction(String clid, String date){
    	id =clid;
    	Date = date;
		for (int i = 0; i< Transaction.product.size(); i++){
			product.set(i, String.valueOf(((ArrayList) Transaction.product).get(i)));
		}

		}

		public static void intialize(){
		transactions.add(new Transaction("JBX09","11/11/2010"));
		transactions.add(new Transaction("JBX09","09/10/2018"));
		}

	public static void getTransactions() {
		String output;
		for (int t=0 ;t<transactions.size();t++){
			output= transactions.toString();
			System.out.println(output);
		}
		return ;
	}


	public static void menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Transaction Options: ");
		System.out.println("C: Calculate Taxes");
		System.out.println("V: Calculate Profit/Loss ");
		System.out.println("E: View Customer transaction");
		System.out.println("q: Quit");
		String ch = scan.nextLine();
		do {
			switch (ch){
				case "C":
					Transaction.taxes();
					break;
				case "V":
					Transaction.profit_Loss();
					break;
				case "E":
					Transaction.getTransactions();
					break;

			}break;
		} while (!ch.equals("q"));

	}

	private static double taxes() {
		Scanner scan = new Scanner(System.in);
		double tax ;
		System.out.println("Enter the tax");
		tax = scan.nextDouble();
		System.out.println("Enter the model number of product.");
		String model = scan.nextLine();

		double amount = 0;
		for (Product p : products) {
			if (p.equals(model)) {
				System.out.println("Enter the amount of product.");
				int item = scan.nextInt();

				amount = item * Product.sellingPrice;
			}
		}


		return tax * amount;
	}

	private static double profit_Loss() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Product model number.");
		String model = scan.nextLine();
		double pL = 0.00;
		for (int i = 0; i< products.size(); i++) {
			String m = Product.getModelNumber();
			if (m.equals(model)) {
				pL = Product.sellingPrice - Product.costPrice;
				return pL;
			} else {

				System.out.println("Product not found!");
				pL = 0.00;
				return pL;
			}

		}
		return pL;
	}


	private String getDate() {
		return Date;
	}

	private String getPayment() {
		return payment;
	}

	private String getId(){
    	return id;
	}

	private double getTotal() {
			//Float cost = Product.getCostPrice();
			Scanner scan = new Scanner(System.in);
			double price = Product.getSellingPrice();
			int amount = Product.getQuantity();
			System.out.println("Enter the amount bought.");
			int items = scan.nextInt();
			Product.quantity = amount - items;
			double tax = taxes();

		return (items * price )+ tax;


		}
		public String toString(){

			return "Customer ID:   "+getId()+"\n"+
					"Date:      "+getDate();
		}

	public String totring () {
			return "Customer:   " + getId() + "\n" +
					"Date:   " + getDate() + "\n" +
					"Total:  " + getTotal() + "\n"+
					"Payment:"+getPayment()+"\n";

		}


	}
