public class ExportSlipDetail {
    private int total;
    private String exportSlipId;
    private Product productId;  
    public String getExportSlipId() {
        return exportSlipId;
    }
    public void setExportSlipId(String exportSlipId) {
        this.exportSlipId = exportSlipId;
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
    public ExportSlipDetail(){}
    public ExportSlipDetail(int total,String exportSlipId,Product productId){
        this.total = total;
        this.exportSlipId=exportSlipId;
        this.productId=productId;
    }
}
