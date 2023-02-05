package com.drishti.mpesa.model.c2b;

import lombok.Data;

@Data
public class ValidationMessage {
    private String transactionType;
    private String transId;
    private String transTime;
    private String transAmount;
    private String businessShortCode;
    private String billRefNumber;
    private String invoiceNumber;
    private String orgAccountBalance;
    private String thirdPartyTransId;
    private String msisdn;
    private String firstName;
}
