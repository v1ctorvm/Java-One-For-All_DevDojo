package javaoneforall.javacore.Ycolletion.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String tittle;
    private double price;
    private int quantity;

    public Manga(Long id, String tittle, double price) {
        Objects.requireNonNull(id, "ID must not be Null");
        Objects.requireNonNull(tittle, "Tittle must not be Null");
        this.id = id;
        this.tittle = tittle;
        this.price = price;
    }

    public Manga(Long id, String tittle, double price, int quantity) {
        this(id, tittle, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(tittle, manga.tittle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tittle);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Manga o) {
        // this | other
        // -1 if this < other
        // 0 if this == other
        // 1 if this > other

//        if (this.id < o.id) return -1;
//        else if (this.id.equals(o.id)) {
//            return 0;
//        } else return 1;

//        return this.id.compareTo(o.id);


    return this.tittle.compareTo(o.tittle);

//        return Double.compare(this.price,o.price);

       // return Double.valueOf(this.price).compareTo(o.price);

    }
}
