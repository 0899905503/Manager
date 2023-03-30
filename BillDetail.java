public class BillDetail {
    private int total;
    private double price;
    private double capitalSum;
    private String billId;
    private Product productId;
    public String getBillDetail() {
        return billId;
    }
    public void setBillDetail(String billDetail) {
        this.billId = billDetail;
    }
    public double getCapitalSum() {
        return capitalSum;
    }
    public void setCapitalSum(double capitalSum) {
        this.capitalSum = capitalSum;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Product getProductId() {
        return productId;
    }
    public void setProductId(Product productId) {
        this.productId = productId;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public BillDetail(){}
    public BillDetail(int total ,double price , double capitalSum,String billDetail, Product productId){
        this.billId=billDetail;
        this.capitalSum=capitalSum;
        this.price=price;
        this.productId=productId;
        this.total=total;
    }
}
