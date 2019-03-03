package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.TransparencyLevel;

public class NecklaceStone {
    private TransparencyLevel transparency;
    private String country;
    private double price;
    private double caratsWeight;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String nameValue) {
        this.name = nameValue;
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

    public void setCountry(final String originCountry) {
        this.country = originCountry;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(final double value) {
        this.price = value;
    }

    public double getCaratsWeight() {
        return caratsWeight;
    }

    public void setCaratsWeight(final double value) {
        this.caratsWeight = value;
    }

    public NecklaceStone() {
    }

    public NecklaceStone(final TransparencyLevel transparencyLevel, final String minePlace, final double priceValue,
                         final double caratsWeightValue, final String nameValue) {
        this.transparency = transparencyLevel;
        this.country = minePlace;
        this.price = priceValue;
        this.caratsWeight = caratsWeightValue;
        this.name = nameValue;
    }

    @Override
    public String toString() {
        return "ua.lviv.iot.NecklaceStone:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n" + "\n\n";
    }
}
