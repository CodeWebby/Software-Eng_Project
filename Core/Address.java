package Core;

class Address {
    private final String address;
    private static Parish parish = null;

    Address(String street, Parish p){
        this.address = street;
        parish = p;
    }

	private String getAddress(){
        return String.format("%s, %s", this.address, parish.fullName());
    }

	static Parish getParish(){
        return parish;
    }

    public String toString(){
        return getAddress();
    }
}
