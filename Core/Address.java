package Core;

class Address {
    private final String address;
    private final Parish parish;

    Address(String street, Parish p){
        this.address = street;
        this.parish = p;
    }

    public Address(String street, String p){
        this.address = street;
        this.parish = Parish.findByName(p);
    }

    private String getAddress(){
        return String.format("%s, %s", this.address, this.parish.fullName());
    }
    public String getAddressOnly(){
        return this.address;
    }

    Parish getParish(){
        return this.parish;
    }

    public String toString(){
        return getAddress();
    }
}
