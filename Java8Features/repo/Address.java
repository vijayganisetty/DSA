package Java8Features.repo;


public class Address {

    private int Drno;
    private String landmark;
    private String street;
    private String city;
    private String district;
    private String state;
    private long pincode;

    public Address() {
    }

    public Address(int drno, String street, String landmark, String city, String district, String state, long pincode) {
        Drno = drno;
        this.street = street;
        this.landmark = landmark;
        this.city = city;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
    }

    public int getDrno() {
        return Drno;
    }

    public void setDrno(int drno) {
        Drno = drno;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }
}
