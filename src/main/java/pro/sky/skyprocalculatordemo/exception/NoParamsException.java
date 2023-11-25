package pro.sky.skyprocalculatordemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Некорректный ввод параметров")
public class NoParamsException extends RuntimeException{
    public NoParamsException() {
    }

    public NoParamsException(String message) {
        super(message);
    }

    public NoParamsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoParamsException(Throwable cause) {
        super(cause);
    }
}
