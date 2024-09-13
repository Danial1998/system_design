public class Vehicle {
    private String regNo;
    private String type;
    private Status status;

    public Vehicle(String regNo, String type, Status status) {
        this.regNo = regNo;
        this.type = type;
        this.status = status;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
