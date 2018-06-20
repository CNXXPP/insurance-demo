package com.centerm.baseproject.controller;

import com.centerm.dto.common.JSONResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象控制器
 * Created by wyp0596 on 28/03/2017.
 */
public abstract class AbstractAPI {

    private static final String success = null;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected <T> JSONResponse<T> success(T result) {
        return new JSONResponse<>(result);
    }

    protected JSONResponse<String> success() {
        return success(success);
    }
}
