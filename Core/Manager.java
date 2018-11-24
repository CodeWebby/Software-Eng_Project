package Core;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Manager {

    private static String confirmhere = null;
    private String Name;
    static String Username = null;
    static String Password = null;

    private String Email;
    private String Telephone;
    static List<String> errorList = new ArrayList<String>();

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
            System.out.println("Confirm password");
            confirmhere = reader.nextLine();

        }
        //System.out.println("your password is: " + passwordhere);

        boolean b = true;
        if ( confirmhere.isEmpty() || Password.isEmpty() || Username.isEmpty()) {
            b = false;
        }
        return b;


    }

    public Manager(String username, String password    ){
        if ( validUsername(username) == true){
            if(validPassword(password) == true){
               System.out.println(" show options for the client to choose");
               return;

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





    public static boolean isValid(String passwordhere, List<String> errorList) {

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
