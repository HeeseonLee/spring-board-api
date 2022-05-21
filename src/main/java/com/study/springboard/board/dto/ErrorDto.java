package com.study.springboard.board.dto;

import lombok.Data;

@Data
public class ErrorDto {
    private StatusEnum status;
    private String message;
    private Object data;


    public ErrorDto() {
        this.status = StatusEnum.BAD_REQUEST;
        this.data = null;
        this.message = null;
    }

    public enum StatusEnum {
        OK(200, "OK"),
        BAD_REQUEST(400, "BAD REQUEST"),
        NOT_FOUND(404, "NOT FOUND"),
        INTERNAL_SERVER_ERROR(500, "INTERNAL SERVER ERROR");

        int code;
        String message;

        StatusEnum(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}
