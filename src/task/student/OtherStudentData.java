package task.student;

public class OtherStudentData {
    private String phoneNumber;
    private String address;

    public OtherStudentData() {
    }

    public OtherStudentData(String phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'';
    }
}
