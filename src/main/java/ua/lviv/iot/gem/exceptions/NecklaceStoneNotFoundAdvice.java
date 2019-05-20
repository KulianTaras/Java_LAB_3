package ua.lviv.iot.gem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NecklaceStoneNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(NecklaceStoneNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String necklaceStoneNotFoundHandler(NecklaceStoneNotFoundException e) {
        return e.getMessage();
    }
}
