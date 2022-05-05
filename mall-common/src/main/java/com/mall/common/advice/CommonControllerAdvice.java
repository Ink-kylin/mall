package com.mall.common.advice;

import cn.hutool.core.text.StrBuilder;
import com.mall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author kylin
 */
@RestControllerAdvice(basePackages = {"com.mall"})
@Slf4j
public class CommonControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<R> MethodArgumentNotValidHandler(MethodArgumentNotValidException exception){
        BindingResult result = exception.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        StrBuilder builder = new StrBuilder();
        fieldErrors.forEach(f->builder.append(f.getDefaultMessage()));
        log.error(builder.toString(),exception);
        return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(R.error(builder.toString()));

    }

}
