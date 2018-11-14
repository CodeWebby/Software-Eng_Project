package Core;
import java.util.ArrayList;
public class Customer {
    private String customerid, telephone, name;
    private ArrayList<Address> addresses;
    private ArrayList<Transaction> transactions;

    public Customer(String clid, String name_, String address_, String parish_,
                  String tel_){
        transactions = getTransactions();
        addresses = new ArrayList<Address>();
        // Parish pa = Parish.KingstonStAndrew;  // default parish
        Parish pa = Parish.findByName(parish_);

        addresses.add(new Address(address_, pa));
        telephone = tel_;
        name = name_;
        customerid = clid;
    }
    public String toString() {
        String f = "Client: %s (%s)\n  Tel: %s%s%s";
        String aa;
        aa = "\n  Address:";
        for (Address b : addresses) {
            aa += String.format("\n    %s", b.toString());
        }
        return String.format(f, name, customerid, telephone,  aa);
    }

    public Parish getPrimaryParish(){
        Address p;
        try{
            p = this.addresses.get(0);
        }
        catch(Exception e){
            p = null;
        }
        return p.getParish();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getCustomer() {
        return toString();
    }
}
