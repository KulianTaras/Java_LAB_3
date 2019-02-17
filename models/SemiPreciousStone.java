package ua.lviv.iot.stone.models;

import ua.lviv.iot.stone.enums.Origin;
import ua.lviv.iot.stone.enums.TransparencyLevel;

public class SemiPreciousStone extends NecklaceStone {
    private Origin type;

    public Origin getType() {
        return type;
    }

    public void setType(Origin type) {
        this.type = type;
    }

    public SemiPreciousStone() {
    }

    public SemiPreciousStone(Origin type) {
        this.type = type;
    }

    public SemiPreciousStone(TransparencyLevel transparency, String minePlace, double price, double caratsWeight, String name, Origin type) {
        super(transparency, minePlace, price, caratsWeight, name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "NecklaceStone -> SemiPreciousStone:\n" +
                "name = " + this.getName() + "\n" +
                "transparency = " + this.getTransparency() + "\n" +
                "country = " + this.getCountry() + "\n" +
                "price = " + this.getPrice() + "\n" +
                "weight in carats = " + this.getCaratsWeight() + "\n" +
                "type of origin = " + type + "\n\n";
    }
}
