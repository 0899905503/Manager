public class ExportSlip {
    private ExportSlipDetail exportSlipId;
    private Date exportDate;
    private Employee employeeId;
    public Employee getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }
    public Date getExportDate() {
        return exportDate;
    }
    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }
    public ExportSlipDetail getExportSlipId() {
        return exportSlipId;
    }
    public void setExportSlipId(ExportSlipDetail exportSlipId) {
        this.exportSlipId = exportSlipId;
    }
    public ExportSlip(){
    }
    public ExportSlip(ExportSlipDetail exportSlipId,Date exportDate,Employee employeeId){
        this.employeeId=employeeId;
        this.exportDate=exportDate;
        this.exportSlipId=exportSlipId;
    }
 }
