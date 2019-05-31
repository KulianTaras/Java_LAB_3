package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.CleavageLevel;
import ua.lviv.iot.gem.enums.TransparencyLevel;

public class Gem extends NecklaceStone {
    private CleavageLevel cleavage;

    public Gem() {
    }

    public Gem(final TransparencyLevel transparency, final String minePlace,
               final double price,
               final double caratsWeight, final String name,
               final CleavageLevel cleavageLevel) {
        super(transparency, minePlace, price, caratsWeight, name);
        this.cleavage = cleavageLevel;
    }

    public CleavageLevel getCleavage() {
        return cleavage;
    }

    public void setCleavage(final CleavageLevel cleavageLevel) {
        this.cleavage = cleavageLevel;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", Cleavage";
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.getCleavage();
    }

    @Override
    public String toString() {
        return "NecklaceStoneRepository -> Gem:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n"
                + "cleavage = " + cleavage + "\n\n";
    }
}
