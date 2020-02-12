package cardoza.mcm.edu.ph.chapter7;

import java.math.BigDecimal;

public class Product {
    private static BigDecimal minPrice = new BigDecimal("0.00");
    private static BigDecimal maxPrice = new BigDecimal("999.99");

    private String productName;
    private String productID;
    private String productDesc;
    private int idgen=20200004;



    private BigDecimal productPrice;

//roduct("Chippy Light Saled","Parat gihapon kaayo")
    public Product(String name,String productDesc){
        productName = name; //Chippy , Nova
        productID = String.valueOf(idgen);
        idgen++;
        this.productDesc = productDesc; //parat, balas2x

        // Chippy =0
        // Nova =1
    }

    public Product(String name, String id, String price) {
        productName = name;

        productID = id;
        productPrice = new BigDecimal(price);
    }
    public String getName(){
        return this.productName;
    }
    public void setName(String name){
        this.productName = name;
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
    public void setPrice(String price) throws IllegalArgumentException {
        BigDecimal tempPrice = new BigDecimal(price);
        if (!isValidPrice(tempPrice)) {
            throw new IllegalArgumentException(price);
        }
        this.productPrice = tempPrice;
    }
    public boolean isValidPrice(BigDecimal price){ if (price.compareTo(minPrice)<0){ return false;
    }
        if (price.compareTo(maxPrice)>0){ return false;
        } return true; }

    public String displayString() {
        return "Product " +
                this.getID() +
                ": " +
                this.getName() +
                " costs " +
                this.getPrice();
    }

}
