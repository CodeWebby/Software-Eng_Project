package Core;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private static String customerid = null;
    private static String telephone = null;
    private static String name = null;
    private static String email = null;
    private static final ArrayList<Address> addresses = new ArrayList<>();
    private static ArrayList<Transaction> transactions;
	static final ArrayList <Customer> customers = new ArrayList<>();




    private Customer(String clid, String name_, String address_, String parish_,
					 String tel_, String email_){
        Transaction.getTransactions();
        // Parish pa = Parish.KingstonStAndrew;  // default parish
        Parish pa = Parish.findByName(parish_);

        Customer.addresses.add(new Address(address_, pa));
        Customer.telephone = tel_;
        Customer.name = name_;
       Customer.customerid = clid;
        Customer.email = email_;
    }

    public static void initialize(){
		customers.add(new Customer("JBX09", "Bond, James", "Brigade Street", "St Mary", "1-876-987-5583","Bond.james@gmail"));
		customers.add(new Customer("SHW34", "Holmes, Sherlock",  "Brigade St. Santa Cruz", "St. Elizabeth", "1-876-759-4441","shrapnull@optonline.net"));
		customers.add(new Customer("THW03", "Hardy, Thomas", " ", "St Catherine",  "1-876-345-9703",""));
		customers.add(new Customer("NDW58", "Drew, Nancy", "12 High St., Black River", "St. Elizabeth", "1-876-859-8089","ishoy@live.com"));
		customers.add(new Customer("JJX12", "Jones, Jessica", "15 Old Hope Road ","Kingston",   "1-876-893-5197",""));
	}

    public static void menu(){
            Scanner scan = new Scanner(System.in);
			System.out.println("Customer Options: ");
			System.out.println("C: Create Customer");
			System.out.println("V: View Customer");
			System.out.println("E: Edit Customer");
			System.out.println("D: Delete Customer");
			System.out.println("q: Quit");
			String ch = scan.nextLine();
						do {
							switch (ch){
								case "C":
									Customer.createCustomer();
									break;
								case "V":
									Customer.viewCustomer();
									break;
								case "E":
									Customer.editCustomer();
									break;
								case "D":
									Customer.deleteCustomer();
									break;
							}
						} while (!ch.equals("q"));

	}

	private static void createCustomer() {
    	String clid = "none";
    	String name_ = "none";
    	String tel_ = "none";
    	String address_ = "none";
    	String parish_ = "none";
    	String email_ = "none";
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the model number of the product.");
		 clid = read.nextLine() ;
		System.out.println("Enter the name of the product.");
		 name_ = read.nextLine() ;
		System.out.println("Enter the type of the product.");
		 tel_ = read.nextLine() ;
		System.out.println("Enter the description of the product.");
		 address_ = read.nextLine() ;
		System.out.println("Enter the cost price of the product.");
		 parish_ = read.nextLine() ;
		System.out.println("Enter the selling price of the product.");
		 email_ = read.nextLine() ;


		Customer e = new Customer( clid,  name_,  address_,  parish_,  tel_,  email_);
		customers.add(e);



	}

	private static void viewCustomer() {
    	String output = null;
    	for (int i = 0; i<customers.size(); i++){
				output= tring();
				System.out.println(output);
		}
    	return;
	}

	private static void deleteCustomer() {
		for (Customer e : customers) {
			System.out.println(e);
		}
		System.out.println("Enter the Customer I.D. you want to remove.");
		Scanner read = new Scanner(System.in);
		String delete = read.nextLine();
		for (Customer e : customers) {
			// noinspection EqualsBetweenInconvertibleTypes
			if (e.equals(delete)) {
				customers.remove(e);
				System.out.println("Customer deleted.");

			} else {
				System.out.println("Customer not found!");
			}
		}

	}

	private static void editCustomer() {
		String choice = null;
		Scanner scan = new Scanner(System.in);
		for (Customer a : customers) {
			System.out.println(a);
		}
		System.out.println("Enter the I.D. number of the customer you want to edit: ");
		String model = scan.nextLine();
		for (Customer a : customers) {
			// noinspection EqualsBetweenInconvertibleTypes
			if (a.equals(model)) {
				System.out.println(a);
				System.out.println("Edit Options: ");
				System.out.println("m: Client I.D.");
				System.out.println("N: Customer Name");
				System.out.println("t: Telephone Number");
				System.out.println("d: Email");
				System.out.println("C: Address");
				System.out.println("q: Quit");

				choice = scan.nextLine();
			}
			do {

				switch (Objects.requireNonNull(choice)) {
					case "m":
						a.setCustomerid(getCustomerid());
						break;
					case "N":
						setName(getName());

						break;
					case "t":
						setTelephone(getTelephone());
						break;
					case "d":
						setEmail(getEmail());
						break;
					case "C":
						setAddresses(getAddresses());
						break;

				} // end of switch
			} while (!choice.equals("q"));


		}
	}

	private static String getTelephone() {
		return telephone;
	}

	private static String getEmail() {
		return email;
	}

	private static String getName() {
		return name;
	}

	private static ArrayList<Address> getAddresses() {
		return addresses;
	}

	private static String getCustomerid() {
		return customerid;
	}

	private static void setAddresses(ArrayList<Address> addresses) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the address (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new address.");
			String address = scan.nextLine();
			System.out.println("Does the customer live in the same parish (yes or no)? ");
			String ch = scan.nextLine();
			if (ch.equals("yes")){
				Customer.addresses.add(new Address(address,Address.getParish()));
			}else{
				System.out.println("Enter the new parish");
				String par = scan.nextLine();
				Parish pa = Parish.findByName(par);
				Customer.addresses.add(new Address(address,pa));

			}
		}else {
			System.out.println(addresses);
		}

	}

	private static void setEmail(String email) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the email (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new email.");
			Customer.email = scan.nextLine();
		}else {
			System.out.println(email);
		}
	}

	private static void setName(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the Customer name  (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new Customer name.");
			Customer.name = scan.nextLine();
		}else {
			System.out.println(name);
		}
	}

	private static void setTelephone(String telephone) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the telephone number (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new telephone number.");
			Customer.telephone = scan.nextLine();
		}else {
			System.out.println(telephone);
		}
	}

	private void setCustomerid(String customerid) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the I.D. number (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new I.D. number.");
			Customer.customerid = scan.nextLine();
		}else {
			System.out.println(customerid);
		}
	}






	private static String tring() {
        String f = "Client: %s (%s)\n  Tel: %s%s%s";
        StringBuilder aa;
        aa = new StringBuilder("\n  Address:");
        for (Address b : addresses) {
            aa.append(String.format("\n    %s", b.toString()));
        }
        String a = "Email: %s\n";
        StringBuilder tt;
        tt = new StringBuilder("\n Transactions:");
        for (Transaction r : transactions){
			tt.append(String.format("\n    %s", r.toString()));
		}
        return String.format(f, name, customerid, telephone, aa.toString(),email, tt.toString());
    }


}
