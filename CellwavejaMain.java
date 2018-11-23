

import java.util.*;

import Core.Customer;
import Core.Manager;

public class CellwavejaMain {










    public static  void main(String[] args){

      String password;
      String User;
      boolean m;

        m =  Manager.Manager1();
        if (m == true){
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a username: ");
            User = reader.nextLine();

            System.out.println("Enter a password : \n");
            password = reader.nextLine();
            new Manager(User,password);
        }




    }
}
