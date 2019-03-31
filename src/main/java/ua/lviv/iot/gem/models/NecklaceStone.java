package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.TransparencyLevel;

public class NecklaceStone {
    private TransparencyLevel transparency;
    private String country;
    private double price;
    private double caratsWeight;
    private String name;

    public NecklaceStone() {
    }

    public NecklaceStone(final TransparencyLevel transparencyLevel,
                         final String minePlace,
                         final double necklaceStonePrice, final double carats,
                         final String necklaceStoneName) {
        this.transparency = transparencyLevel;
        this.country = minePlace;
        this.price = necklaceStonePrice;
        this.caratsWeight = carats;
        this.name = necklaceStoneName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String necklaceStoneName) {
        this.name = necklaceStoneName;
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

    public void setPrice(final double necklaceStonePrice) {
        this.price = necklaceStonePrice;
    }

    public double getCaratsWeight() {
        return caratsWeight;
    }

    public void setCaratsWeight(final double carats) {
        this.caratsWeight = carats;
    }

    @Override
    public String toString() {
        return "NecklaceStone:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n"
                + "\n\n";
    }
}
