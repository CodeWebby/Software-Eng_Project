package Core;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Manager {

    private static String confirmhere = null;
    private static String Name;
    static String username = null;
    static String password = null;

    private static String Email;
    private static String telephone;
    static List<String> errorList = new ArrayList<String>();

    public static boolean Manager1(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a username: ");
        username = reader.nextLine();

        System.out.println("Enter a password : \n");
        System.out.println(" At least eight characters.\n" +
                        " At least one uppercase character.\n " +
                        " At least one lowercase character.\n"+
                        " At least one number.\n"+
                        " At least one special character\n");
        password = reader.nextLine();
        System.out.println("Confirm password");
        confirmhere = reader.nextLine();

        while (!isValid(password, errorList)) {
            System.out.println("The password entered here  is invalid");
            for (String error : errorList) {
                System.out.println(error);
            }

            System.out.print("Please enter a given  password : ");
            password = reader.nextLine();
            System.out.println("Confirm password: ");
            confirmhere = reader.nextLine();

        }
        //System.out.println("your password is: " + passwordhere);
        System.out.println("Enter your Email: ");
        Email = reader.nextLine();
        System.out.println("Enter your full name: ");
        Name = reader.nextLine();
        System.out.println(" Enter your phone number (example- (111)111-1111 ");
        telephone = reader.nextLine();

        boolean b = true;
        if ( confirmhere.isEmpty() || password.isEmpty() || username.isEmpty()) {
            b = false;
        }
        return b;


    }

    public Manager(String username, String password){
        Scanner reader = new Scanner(System.in);
        if ( validUsername(username) == true){
            if(validPassword(password) == true){
                System.out.println("Enter the last 4 digits of your phone number : ");
                String last = reader.nextLine();
                  String num = getTelephone().substring(getTelephone().length() - 4);

                  if(last.equals(num) ){
               System.out.println(" show options for the client to choose");
               return;

              }
             }else{
                System.out.println("Invalid password");
                return;
            }
        }else{
            System.out.println("Invalid username ");
            return ;
        }

    }



    public boolean validPassword(String passwor){
        return passwor.equals(getPassword());
    }

    public boolean validUsername(String username){
        return username.equals( getUsername());
    }
    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getTelephone() {
        return this.Telephone;
    }

    public String getName() {
        return this.Name;
    }

    @Override
    public String toString() {
        return " Contact Information  \n"+
                "Name:     "+ getName() + "\n"+
                "Telephone:  "+ getTelephone() + "\n"+
                "Email:    "+ getEmail() + " \n"+
                "------------------------------";
    }

    public static boolean isValid(String passwordhere, List<String> errorList) {

        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern upperCasePatten = Pattern.compile("[A-Z ]");
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
        if (!upperCasePatten.matcher(passwordhere).find()) {
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
