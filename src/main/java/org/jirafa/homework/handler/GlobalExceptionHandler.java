package org.jirafa.homework.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.jirafa.homework.Utils.R;
import org.jirafa.homework.Utils.Result;

/**
 * @author jirafa
 * @date 2022/06/20
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result error(Exception e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return R.fail(e.getMessage());
    }
}
