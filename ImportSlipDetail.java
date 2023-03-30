import java.sql.RowId;

public class ImportSlipDetail {
    private int total;
    private Product price;
    private Date updateDate;
    private String discount;
    private ImportSlip importSlipId;
    private Product productId;
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    public ImportSlip getImportSlipId() {
        return importSlipId;
    }
    public void setImportSlipId(ImportSlip importSlipId) {
        this.importSlipId = importSlipId;
    }
    public Product getPrice() {
        return price;
    }
    public void setPrice(Product price) {
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
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public ImportSlipDetail(){}
    public ImportSlipDetail(int total,Product price , Date updateDate , String discount ,ImportSlip importSlipId,Product productId){
        this.discount = discount;
        this.importSlipId=importSlipId;
        this.total=total;
        this.price=price;
        this.updateDate=updateDate;
        this.productId=productId;
    }
}
