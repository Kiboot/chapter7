package cardoza.mcm.edu.ph.chapter7;

import java.math.BigDecimal;

public class Product {

    //("Titan Gel MAX","6969","696969");
    private String productName; //happy ending ni TT GEL MAX
    private String productID;
    private BigDecimal productPrice;

    public Product(String name, String id, String price) {
        productName = name; //titan gel
        productID = id; //6969
        productPrice = new BigDecimal(price); //696969
    }
    public String getName(){
        return this.productName;
    }
    public void setName(String name){
        this.productName = name; //TT GEL MAX
    }
    public String getID(){
        return this.productID;
    }
    public void setID(String id){
        this.productID = id;
    }
    public BigDecimal getPrice(){
        return this.productPrice;
    }
    public void setPrice(String price){
        this.productPrice = new BigDecimal(price);
    }
    public String displayString() {
        return "Product " +
                this.getID() +
                ": " +
                this.getName() +
                " costs " +
                this.getPrice();
    }

}
