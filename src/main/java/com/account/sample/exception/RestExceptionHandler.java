package com.account.sample.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import static org.springframework.util.ObjectUtils.isEmpty;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AccountTransNotFoundException.class)
    protected ResponseEntity<ApiError> handleAccountNumberNotFound(Exception ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex.getMessage());
        return new ResponseEntity(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidUserDetail.class)
    protected ResponseEntity<ApiError> handleUSerNotFound(Exception ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex.getMessage());
        return new ResponseEntity(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ApiError> handleAllOtherException(Exception ex) {

       String message = !isEmpty(ex.getMessage()) ? ex.getMessage() : "Something went wrong.Please try later.";
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, message);
        return new ResponseEntity(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
