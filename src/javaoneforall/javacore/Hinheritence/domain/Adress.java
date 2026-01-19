package javaoneforall.javacore.Hinheritence.domain;

public class Adress {
    private String sreet;
    private String zipcode;

    public Adress() {
    }

    public Adress(String sreet, String zipcode) {
        this.sreet = sreet;
        this.zipcode = zipcode;
    }

    public String getSreet() {
        return sreet;
    }

    public void setSreet(String sreet) {
        this.sreet = sreet;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
