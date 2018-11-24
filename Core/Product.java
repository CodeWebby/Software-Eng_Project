package Core;

public class Product {
    private String colour,description,brandName,productType;
    protected float costPrice,sellingPrice;
    protected int quantity;
    protected String Serial;

    public Product(String colour, String description, String brandName, String productType,
                    float costPrice, float sellingPrice){
        this.colour = colour;
        this.description = description;
        this.brandName = brandName;
        this.productType = productType;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }
    public String viewProduct(){
        return toString();
    }

    public float getCostPrice() {
        return costPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getColour() {
        return colour;
    }

    public String getSerial() {
        return Serial;
    }

    public String getProductType() {
        return productType;
    }

    public String getDescription() {
        return description;
    }
    public String toString(){
        return  "Brand Name:              " + getBrandName() + "\n" +
                "Serial:                " + getSerial() + "\n" +
                "Product Type           " + getProductType()+"\n"+
                "Description:           " + getDescription()+ "\n" +
                " Colour                " + getColour() +"\n"+
                "Quantity:              " + getQuantity() + "\n" +
                "Selling Price          "+ getSellingPrice() + "\n"+
                "+++++++++++++++++++\n";
    }
}
