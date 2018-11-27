package Core;
import java.util.ArrayList;
import java.util.Objects;

class Customer {
    private final String customerid;
    private final String telephone;
    private final String name;
    private final ArrayList<Address> addresses;
    private final ArrayList<Transaction> transactions;

    public Customer(String clid, String name_, String address_, String parish_,
                  String tel_){
        transactions = getTransactions();
        addresses = new ArrayList<>();
        // Parish pa = Parish.KingstonStAndrew;  // default parish
        Parish pa = Parish.findByName(parish_);

        addresses.add(new Address(address_, pa));
        telephone = tel_;
        name = name_;
        customerid = clid;
    }
    public String toString() {
        String f = "Client: %s (%s)\n  Tel: %s%s%s";
        StringBuilder aa;
        aa = new StringBuilder("\n  Address:");
        for (Address b : addresses) {
            aa.append(String.format("\n    %s", b.toString()));
        }
        return String.format(f, name, customerid, telephone, aa.toString());
    }

    public Parish getPrimaryParish(){
        Address p;
        try{
            p = this.addresses.get(0);
        }
        catch(Exception e){
            p = null;
        }
        return Objects.requireNonNull(p).getParish();
    }

    private ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getCustomer() {
        return toString();
    }
}
