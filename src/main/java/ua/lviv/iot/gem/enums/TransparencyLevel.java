package ua.lviv.iot.gem.enums;

public enum TransparencyLevel {
    ZERO(0), LOW(1), MIDDLE(2), HIGH(3);

    private int value;

    TransparencyLevel(final int level) {
        this.value = level;
    }

    public int getValue() {
        return value;
    }
}