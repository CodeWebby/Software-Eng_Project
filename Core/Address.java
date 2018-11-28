package Core;

class Address {
    private final String address;
    private static Parish parish = null;

    Address(String street, Parish p){
        this.address = street;
        parish = p;
    }

    public Address(String street, String p){
        this.address = street;
        parish = Parish.findByName(p);
    }

    private String getAddress(){
        return String.format("%s, %s", this.address, parish.fullName());
    }
    public String getAddressOnly(){
        return this.address;
    }

    static Parish getParish(){
        return parish;
    }

    public String toString(){
        return getAddress();
    }
}
