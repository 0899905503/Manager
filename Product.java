public class Product {
    private String productId;
    private String productName;
    private double price;
    private String unit;
    private String productionSite; // noi san xuat
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductionSite() {
        return productionSite;
    }
    public void setProductionSite(String productionSite) {
        this.productionSite = productionSite;
    }public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Product(){}
    public Product(String productId,String productName,double price,String unit,String productionSite){
        this.price=price;
        this.productId=productId;
        this.productName = productName;
        this.productionSite=productionSite;
        this.unit=unit;
    }
    public void DisPlay(){
        System.out.println("Product Id : "+productId+"// Product Name : "+productName+"// Price : "+price+"// Unit : "+unit+"// Production Site : "+productionSite);
    }
    public String ProductId(String productId){
        return this.productId;
    }
}
