package Core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Transaction {

    private Date Time;
    private Date Date;
    private Boolean Card;
    private Boolean Cash;
    protected ArrayList<Transaction>transactions = new ArrayList<>();

    Transaction(){
    	toString();
	}

	/*public Float taxes(){
    	System.out.println("Enter the tax");
    	Taxes = tax *
    	return Taxes;
	}*/

	public Float profit_Loss(){
		Float pL = Product.sellingPrice - Product.costPrice;
		return pL;
	}


	public java.util.Date getTime() {
		return Time;
	}

	public java.util.Date getDate() {
		return Date;
	}

	public Float getTotal(){
		//Float cost = Product.getCostPrice();
		Scanner scan = new Scanner(System.in);
		Float price = Product.getSellingPrice();
		int amount = Product.getQuantity();
		System.out.println("Enter the amount bought.");
		int items = scan.nextInt();
		Product.quantity = amount - items;

		Float total = items * price;

		return total;


	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		Transaction e = new Transaction();
    	transactions.add(e);
	}

	public String toString(){
    	return  "Time:   "+ getTime()+"\n"+
				"Date:   "+ getDate()+"\n"+
				"Total:  "+ getTotal()+"\n";

	}




}
