package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

public class ApiException extends Exception {
    private int code;

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
