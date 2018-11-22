package Core;



public class Manager {

    private String Name;
    private String Username;
    private String Password;
    private String Email;
    private String Telephone;
    
    public Manager(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a username: ");
         this.Username = reader.nextLine();
         
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a password : \n");
        System.out.println(" At least eight characters.\n"
                           " At least one uppercase character.\n"
                           " At least one lowercase character.\n"
                           " At least one number.\n"
                           " At least one special character\n");
         this.Password = reader.nextLine(); 
         
         if (correctPass( this.Password) == true){
             System.out.println(" Works ");
         }else{
             System.out.println("Enter a password : \n");
        System.out.println(" At least eight characters.\n"
                           " At least one uppercase character.\n"
                           " At least one lowercase character.\n"
                           " At least one number.\n"
                           " At least one special character\n");
         this.Password = reader.nextLine();
         }
         
         
    }

    public Manager(String username, String password    ){
          if ( validUsername(username) == true){
             if(validPassword(password) == true){
                 // show options for the client to choose
             }else{
                 System.out.println("Invalid password");
                 return;
             }
          }else{
              System.out.println("Invalid username ");
              return false;
          }
           
    }
    
    correctPass(String pass){
        if(pass.length() != 8 ){
            System.out.println(" Invalid");
            return
        }else if () {
            
        }
    }
    
    public validPassword(String passwor){
        if(passwor == this.Password){
            return true;
        }else{
            return false;
        }
    }
    
     public validUsername(String username){
        if(username == this.Username){
            return true;
        }else{
            return false;
        }
    }
    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }
}

