package ua.lviv.iot.stone.models;

import ua.lviv.iot.stone.enums.CleavageLevel;
import ua.lviv.iot.stone.enums.TransparencyLevel;

public class Gem extends NecklaceStone {
    private CleavageLevel cleavage;

    public CleavageLevel getCleavage() {
        return cleavage;
    }

    public void setCleavage(CleavageLevel cleavage) {
        this.cleavage = cleavage;
    }

    public Gem() {
    }

    public Gem(CleavageLevel cleavage) {
        this.cleavage = cleavage;
    }

    public Gem(TransparencyLevel transparency, String minePlace, double price, double caratsWeight, String name, CleavageLevel cleavage) {
        super(transparency, minePlace, price, caratsWeight, name);
        this.cleavage = cleavage;
    }

    @Override
    public String toString() {
        return "NecklaceStone -> Gem:\n" +
                "name = " + this.getName() + "\n" +
                "transparency = " + this.getTransparency() + "\n" +
                "country = " + this.getCountry() + "\n" +
                "price = " + this.getPrice() + "\n" +
                "weight in carats = " + this.getCaratsWeight() + "\n" +
                "cleavage = " + cleavage + "\n\n";
    }
}
