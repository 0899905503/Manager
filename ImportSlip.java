class ImportSlip{
    private String importSlipId;
    private Product productId ;
    private Date importDate;
    //))))))))))))))))))
    private double capitalSum;
    //))))))))))))))))))
    private Producer producerId;
    private Employee employeeId;
    public Employee getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }
    public Date getImportDate() {
        return importDate;
    }
    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }
    public Producer getProducerId() {
        return producerId;
    }
    public void setProducerId(Producer producerId) {
        this.producerId = producerId;
    }
    public Product getProductId() {
        return productId;
    }
    public void setProductId(Product productId) {
        this.productId = productId;
    }
    public double getCapitalSum() {
        return capitalSum;
    }
    public void setCapitalSum(double capitalSum) {
        this.capitalSum = capitalSum;
    }
   // Import slip detail
   public ImportSlip(){
   }   
   public ImportSlip(String importSlipId,Product productId,Date importDate,double capitalSum,Producer producerId , Employee employeeId){
   this.employeeId=employeeId;
   this.producerId=producerId;
   this.productId=productId;
   this.capitalSum=capitalSum;
   this.importDate=importDate;
   this.importSlipId=importSlipId;
   }
}