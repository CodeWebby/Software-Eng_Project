package Core;



public class Manager {

    private String Name;
    private String Username;
    private String Password;
    private String Email;
    private String Telephone;

    public Manager(String username, String password    ){
           this.Username = username;
           this.Password = password;
    }
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
}

