public class Employee {
    private String employeeId;
    private String employeeName;
    private String gender;
    private Date birthday;
    private String address;
    private int phoneNumber;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Employee(){}
    public Employee(String employeeId , String employeeName , String gender,Date birthday,String address,int phoneNumber){
        this.address=address;
        this.birthday=birthday;
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
    }
}
