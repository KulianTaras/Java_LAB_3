package ua.lviv.iot.gem.models;

import ua.lviv.iot.gem.enums.Origin;
import ua.lviv.iot.gem.enums.TransparencyLevel;

public class SemiPreciousStone extends NecklaceStone {
    private Origin type;

    public SemiPreciousStone() {
    }

    public SemiPreciousStone(final TransparencyLevel transparency,
                             final String minePlace, final double price,
                             final double caratsWeight, final String name,
                             final Origin origin) {
        super(transparency, minePlace, price, caratsWeight, name);
        this.type = origin;
    }

    public Origin getType() {
        return type;
    }

    public void setType(final Origin origin) {
        this.type = origin;
    }



    @Override
    public String getHeaders() {
        return super.getHeaders() + ", Type of origin";
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.getType();
    }

    @Override
    public String toString() {
        return "NecklaceStoneRepository -> SemiPreciousStone:\n"
                + "name = " + this.getName() + "\n"
                + "transparency = " + this.getTransparency() + "\n"
                + "country = " + this.getCountry() + "\n"
                + "price = " + this.getPrice() + "\n"
                + "weight in carats = " + this.getCaratsWeight() + "\n"
                + "type of origin = " + type + "\n\n";
    }
}
