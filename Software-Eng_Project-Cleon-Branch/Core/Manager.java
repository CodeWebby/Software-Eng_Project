package Core;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Manager {

    private static String confirmhere = null;
    private  static String Name;
    private static String Username = null;
    private static String Password = null;

    private static String Email;
    private static String Telephone;
     private static final List<String> errorList = new ArrayList<>();

    public static boolean Manager1(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a username: ");
        Username = reader.nextLine();

        System.out.println("Enter a password : \n");
        System.out.println(" At least eight characters.\n" +
                        " At least one uppercase character.\n " +
                        " At least one lowercase character.\n"+
                        " At least one number.\n"+
                        " At least one special character\n");
        Password = reader.nextLine();
        System.out.println("Confirm password");
        confirmhere = reader.nextLine();

        while (!isValid(Password, errorList)) {
            System.out.println("The password entered here  is invalid");
            for (String error : errorList) {
                System.out.println(error);
            }

            System.out.print("Please enter a given  password : ");
            Password = reader.nextLine();
            System.out.println("Confirm password: ");
            confirmhere = reader.nextLine();

        }
        //System.out.println("your password is: " + passwordhere);
         System.out.println("Enter your Email: ");
         Email = reader.nextLine();
         System.out.println("Enter your full name: ");
         Name = reader.nextLine();
         System.out.println(" Enter your phone number (example- (111)111-1111 ");
         Telephone = reader.nextLine();

        boolean b = true;
        if ( confirmhere.isEmpty() || Password.isEmpty() || Username.isEmpty()) {
            b = false;
        }
        return b;


    }

    public Manager(String username, String password    ){
        Scanner reader = new Scanner(System.in);
        if (validUsername(username)){
            if(validPassword(password)){
                System.out.println("Enter the last 4 digits of your phone number : ");
                String last = reader.nextLine();
                  String num = getTelephone().substring(getTelephone().length() - 4);

                  if(last.equals(num) ){
                      System.out.println(" show options for the client to choose");
                      System.out.println("Command Options: ");
                      System.out.println("P: Product");
                      System.out.println("C: Customer");
                      System.out.println("T: Transaction");
                      System.out.println("q: Quit");
                      Scanner scan = new Scanner(System.in);
                      String choice = scan.nextLine();
                      do {
                          switch (choice) {
                              case "P":

                                  System.out.println("Command Options: ");
                                  System.out.println("C: Create Product");
                                  System.out.println("V: View Product");
                                  System.out.println("E: Edit Product");
                                  System.out.println("D: Delete Product");
                                  System.out.println("q: Quit");
                                  String ch = scan.nextLine();
                                  do {
                                      switch (ch){
                                          case "C":
                                              //Product.createProduct();
                                              break;
                                          case "V":
                                              //viewProduct();
                                              break;
                                          case "E":
                                            //  Product.editProduct();
                                              break;
                                          case "D":
                                              //Product.deleteProduct();
                                              break;
                                      }
                                  } while (!ch.equals("q"));
                                  break;


                              case "C":
                                  Customer.menu();

                                  break;
                              case "T":
                                  System.out.println("Transaction class");
                                  break;


                          }
                      } while (!choice.equals("q"));

                  }
             }else{
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid username ");
        }

    }



    private boolean validPassword(String passwor){
        return passwor.equals(getPassword());
    }

    private boolean validUsername(String username){
        return username.equals( getUsername());
    }
    private String getUsername() {
        return Username;
    }

    private String getPassword() {
        return Password;
    }

    private String getEmail() {
        return Email;
    }

    private String getTelephone() {
        return Telephone;
    }

    private String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return " Contact Information  \n"+
                "Name:     "+ getName() + "\n"+
                "Telephone:  "+ getTelephone() + "\n"+
                "Email:    "+ getEmail() + " \n"+
                "------------------------------";
    }

    private static boolean isValid(String passwordhere, List<String> errorList) {

        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");
        errorList.clear();

        boolean flag=true;

        if (!passwordhere.equals(confirmhere)) {
            errorList.add("password and confirm password does not match");
            flag=false;
        }
        if (passwordhere.length() < 8) {
            errorList.add("Password lenght must have atleast 8 character !!");
            flag=false;
        }
        if (!specailCharPatten.matcher(passwordhere).find()) {
            errorList.add("Password must have atleast one specail character !!");
            flag=false;
        }
        if (!UpperCasePatten.matcher(passwordhere).find()) {
            errorList.add("Password must have atleast one uppercase character !!");
            flag=false;
        }
        if (!lowerCasePatten.matcher(passwordhere).find()) {
            errorList.add("Password must have atleast one lowercase character !!");
            flag=false;
        }
        if (!digitCasePatten.matcher(passwordhere).find()) {
            errorList.add("Password must have atleast one digit character !!");
            flag=false;
        }

        return flag;

    }


}
