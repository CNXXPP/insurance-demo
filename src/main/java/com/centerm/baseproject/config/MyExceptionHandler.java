package com.centerm.baseproject.config;

import com.centerm.baseproject.enums.GlobalErrorEnum;
import com.centerm.dto.common.JSONResponse;
import com.centerm.exception.MyRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制层异常处理器
 * Created by wyp0596 on 21/03/2017.
 */
@RestControllerAdvice
public class MyExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(HttpServletRequest request,
                                         Exception exception, HttpServletResponse response) {
        logger.warn("异常:", exception);
        if (exception instanceof MyRuntimeException) {
            MyRuntimeException e = (MyRuntimeException) exception;
            return new JSONResponse(e.getResponse());
        }
        if (exception instanceof MethodArgumentNotValidException ||
                exception instanceof IllegalArgumentException) {
            return new JSONResponse<>(GlobalErrorEnum.PARAM_ERROR.getCode(), exception.getMessage(), null);
        }
        if(exception instanceof MissingServletRequestParameterException) {
            return new JSONResponse<>(GlobalErrorEnum.PARAM_ERROR.getCode(), exception.getMessage(), null);
        }
        if(exception instanceof HttpMediaTypeNotSupportedException) {
            return new JSONResponse<>(GlobalErrorEnum.REQUEST_HEADER_ERROR.getCode(), exception.getMessage(), null);
        }

        return new JSONResponse(GlobalErrorEnum.UNKNOWN_ERROR);
    }
}
