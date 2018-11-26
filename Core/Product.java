package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private String colour,description,productName,productType;
    private Float costPrice,sellingPrice;
    private int quantity;
    private String modelNumber;
    private String imageName;
    private ArrayList <Product> products = new ArrayList<>();
    private Product e;


    public Product(String modelNumber, String productName, String productType, String description, Float costPrice,Float sellingPrice, int quantity, String imageName, String colour ) {

        this.modelNumber = modelNumber;
        this.productName = productName;
        this.productType = productType;
        this.description = description;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.imageName = imageName;
        this.colour = colour;


    }
        public void createProduct(){

              Scanner read = new Scanner(System.in);
              System.out.println("Enter the model number of the product.");
              modelNumber = read.nextLine() ;
              System.out.println("Enter the name of the product.");
              productName = read.nextLine() ;
              System.out.println("Enter the type of the product.");
              productType = read.nextLine() ;
              System.out.println("Enter the description of the product.");
              description = read.nextLine() ;
              System.out.println("Enter the cost price of the product.");
              costPrice = read.nextFloat() ;
              System.out.println("Enter the selling price of the product.");
              sellingPrice = read.nextFloat() ;
              System.out.println("Enter the quantity of the product.");
              quantity = read.nextInt() ;
              System.out.println("Enter the colour  of the product.");
              colour = read.nextLine() ;

              e = new Product(modelNumber, productName, productType, description, costPrice, sellingPrice, quantity, imageName,colour);
               products.add(e);

    }
          public String viewProduct(){
            return toString();
}

          public  void editProduct(){

}
          public void  deleteProduct() {
              System.out.println("Enter the model number of the product you want to remove.");
              Scanner read = new Scanner(System.in);
              String delete = read.nextLine();
              for (Product e : products) {
                  if ( e.equals(delete)) {
                      products.remove(e);
                      System.out.println("Product deleted");

                  } else{
                      System.out.println( "Product not found!");
                  }
              }
           return;}


    public float getCostPrice() {
        return costPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getColour() {
        return colour;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getProductType() {
        return productType;
    }

    public String getDescription() {
        return description;
    }
    public String getImageName(){
        return imageName;
    }
    public String toString(){
        return  "Brand Name:              " + getProductName() + "\n" +
                "Serial:                " + getModelNumber() + "\n" +
                "Product Type           " + getProductType()+"\n"+
                "Description:           " + getDescription()+ "\n" +
                "Colour                " + getColour() +"\n"+
                "Quantity:              " + getQuantity() + "\n" +
                "Selling Price          "+ getSellingPrice() + "\n"+
                "+++++++++++++++++++\n";
    }
}
