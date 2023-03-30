public class Bill {
    private String billId;
    private Date sellDate;
    private BillDetail capitalSum; // tong tien
    private Employee employeeId;
    public String getBillId() {
        return billId;
    }
    public void setBillId(String billId) {
        this.billId = billId;
    } 
    public BillDetail getCapitalSum() {
        return capitalSum;
    }
    public void setCapitalSum(BillDetail capitalSum) {
        this.capitalSum = capitalSum;
    }
    public Employee getEmployeeId() {
        return employeeId;
    }  
    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }public Date getSellDate() {
        return sellDate;
    }
    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }
    public Bill(){}
    public Bill(String billId,Date sellDate,BillDetail capitalSum,Employee employeeId){
    this.billId=billId;
    this.capitalSum=capitalSum;
    this.employeeId=employeeId;
    this.sellDate=sellDate;
    }
}
