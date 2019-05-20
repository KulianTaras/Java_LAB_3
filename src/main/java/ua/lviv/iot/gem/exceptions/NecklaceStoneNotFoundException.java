package ua.lviv.iot.gem.exceptions;

public class NecklaceStoneNotFoundException extends RuntimeException {
    public NecklaceStoneNotFoundException(Integer id) {
        super("Could not find necklace stone wit id " + id);
    }
}
