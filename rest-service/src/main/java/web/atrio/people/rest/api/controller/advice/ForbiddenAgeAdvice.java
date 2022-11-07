package web.atrio.people.rest.api.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import web.atrio.people.rest.api.exception.ForbiddenAgeException;

@ControllerAdvice
public class ForbiddenAgeAdvice {

    @ResponseBody
    @ExceptionHandler(ForbiddenAgeException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String employeeNotFoundHandler(ForbiddenAgeException ex) {
        return ex.getMessage();
    }
}
