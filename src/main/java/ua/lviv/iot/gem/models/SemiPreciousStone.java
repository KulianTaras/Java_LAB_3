package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.Origin;
import ua.lviv.iot.gem.enums.TransparencyLevel;

public class SemiPreciousStone extends NecklaceStone {
    private Origin type;

    public Origin getType() {
        return type;
    }

    public void setType(final Origin origin) {
        this.type = origin;
    }

    public SemiPreciousStone() {
    }

    public SemiPreciousStone(final Origin origin) {
        this.type = origin;
    }

    public SemiPreciousStone(final TransparencyLevel transparency, final String minePlace, final double priceValue,
                             final double caratsWeight, final String name, final Origin origin) {
        super(transparency, minePlace, priceValue, caratsWeight, name);
        this.type = origin;
    }

    @Override
    public String toString() {
        return "ua.lviv.iot.NecklaceStone -> ua.lviv.iot.SemiPreciousStone:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n"
                + "type of origin = " + type + "\n\n";
    }
}