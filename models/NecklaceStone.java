package ua.lviv.iot.stone.models;

import ua.lviv.iot.stone.enums.TransparencyLevel;

public class NecklaceStone {
    private TransparencyLevel transparency;
    private String country;
    private double price;
    private double caratsWeight;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public TransparencyLevel getTransparency() {
        return transparency;
    }

    public void setTransparency(TransparencyLevel transparency) {
        this.transparency = transparency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCaratsWeight() {
        return caratsWeight;
    }

    public void setCaratsWeight(double caratsWeight) {
        this.caratsWeight = caratsWeight;
    }

    public NecklaceStone() {
    }

    public NecklaceStone(TransparencyLevel transparency, String minePlace, double price, double caratsWeight, String name) {
        this.transparency = transparency;
        this.country = minePlace;
        this.price = price;
        this.caratsWeight = caratsWeight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "NecklaceStone:\n" +
                "name = " + this.getName() + "\n" +
                "transparency = " + this.getTransparency() + "\n" +
                "country = " + this.getCountry() + "\n" +
                "price = " + this.getPrice() + "\n" +
                "weight in carats = " + this.getCaratsWeight() + "\n" + "\n\n";
    }
}
