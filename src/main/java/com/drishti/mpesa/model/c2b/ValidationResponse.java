package com.drishti.mpesa.model.c2b;

import lombok.Data;

@Data
public class ValidationResponse {
    private String resultCode;
    private String resultDesc;

    public ValidationResponse() {
        this.resultCode = "0";
        this.resultDesc = "Accepted";
    }

    public ValidationResponse(String resultCode, String resultDesc) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }
}
