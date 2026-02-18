package javaoneforall.javacore.Ycolletion.domain;

public class Smartphone {
    private String serialNumber;
    private String name;


    public Smartphone(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone obj1 = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(obj1.serialNumber);
    }

    // if x.equals(y) == true, y.hashCode() == x.hashCode();
    // y.hashCode() == x.hashCode() == doesnt mean that y.equals(x) == true;
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) should be false
    @Override
    public int hashCode() {
        return  serialNumber == null ? 0 : serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
