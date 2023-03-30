public class Producer {
    private String producerId;
    private String producerName;
    private String address;
    private String email;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProducerId() {
        return producerId;
    }
    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }
    public String getProducerName() {
        return producerName;
    }
    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
    public Producer(){}
    public Producer(String producerId,String producerName,String address,String email){
        this.address=address;
        this.email=email;
        this.producerId=producerId;
        this.producerName=producerName;
    }
}
