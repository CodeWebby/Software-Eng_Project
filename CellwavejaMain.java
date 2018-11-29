

import java.util.*;

import Core.Customer;
import Core.Manager;
import Core.Product;
import Core.Transaction;

class CellwavejaMain {












	public static void main(String[] args){

      String password;
      String User;
      boolean m;


          Customer.initialize();
		  Product.intialize();
		Transaction.intialize();

        m =  Manager.Manager2();
        if (m){
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a username: ");
            User = reader.nextLine();

            System.out.println("Enter a password : \n");
            password = reader.nextLine();
            new Manager(User,password);
        }




    }
}
