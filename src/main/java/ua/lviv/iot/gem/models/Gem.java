package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.CleavageLevel;
import ua.lviv.iot.gem.enums.TransparencyLevel;

public class Gem extends NecklaceStone {
    private CleavageLevel cleavage;

    public CleavageLevel getCleavage() {
        return cleavage;
    }

    public void setCleavage(final CleavageLevel cleavageLevel) {
        this.cleavage = cleavageLevel;
    }

    public Gem() {
    }

    public Gem(final CleavageLevel cleavageLevel) {
        this.cleavage = cleavageLevel;
    }

    public Gem(final TransparencyLevel transparency, final String minePlace, final double price,
               final double caratsWeight, final String name, final CleavageLevel cleavageLevel) {
        super(transparency, minePlace, price, caratsWeight, name);
        this.cleavage = cleavageLevel;
    }

    @Override
    public String toString() {
        return "ua.lviv.iot.NecklaceStone -> ua.lviv.iot.Gem:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n"
                + "cleavage = " + cleavage + "\n\n";
    }
}
