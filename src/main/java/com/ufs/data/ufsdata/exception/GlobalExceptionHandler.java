package com.ufs.data.ufsdata.exception;

import com.ufs.data.ufsdata.model.meta.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Winston.xu
 * @date 2020/6/12
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorInfo> defaultErrorHandler(HttpServletRequest request, Exception e) {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setCode(ErrorInfo.ERROR);
        r.setData(e.getMessage());
        r.setMessage(e.getMessage());
        r.setData("Some Data");
        r.setUrl(request.getRequestURL().toString());
        return new ResponseEntity<>(r, HttpStatus.BAD_REQUEST);
    }
}
