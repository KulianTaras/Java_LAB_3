package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.TransparencyLevel;

import javax.persistence.*;


@Entity
public class NecklaceStone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private TransparencyLevel transparency;
    private String country;
    private double price;
    private double caratsWeight;
    private String name;

    public NecklaceStone() {
    }

    public NecklaceStone(final TransparencyLevel transparencyLevel,
                         final String minePlace,
                         final double NecklaceStonePrice, final double carats,
                         final String NecklaceStoneName) {
        this.transparency = transparencyLevel;
        this.country = minePlace;
        this.price = NecklaceStonePrice;
        this.caratsWeight = carats;
        this.name = NecklaceStoneName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String NecklaceStoneName) {
        this.name = NecklaceStoneName;
    }

    public TransparencyLevel getTransparency() {
        return transparency;
    }

    public void setTransparency(final TransparencyLevel transparencyLevel) {
        this.transparency = transparencyLevel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String miningCountry) {
        this.country = miningCountry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double NecklaceStonePrice) {
        this.price = NecklaceStonePrice;
    }

    public double getCaratsWeight() {
        return caratsWeight;
    }

    public void setCaratsWeight(final double carats) {
        this.caratsWeight = carats;
    }

    public String getHeaders() {
        return "Name" + ", Transparency" + ", Country" + ", Price"
                + ", Weight in carats";
    }

    public String toCSV() {
        return this.getName() + ", " + this.getTransparency() + ", "
                + this.getCountry()
                + ", " + this.getPrice() + ", " + this.getCaratsWeight();

    }

    @Override
    public String toString() {
        return "NecklaceStoneRepository:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n"
                + "\n\n";
    }
}
