package org.yzh.homework.Utils;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Result<T> implements Serializable {
    private T result;
    private Boolean succeed;
    private String message;

    public Result() {
    }

    public Result(T result, Boolean succeed, String message) {
        this.result = result;
        this.succeed = succeed;
        this.message = message;
    }

    public Result(Boolean succeed, String message) {
        this.result = null;
        this.succeed = succeed;
        this.message = message;
    }
}
