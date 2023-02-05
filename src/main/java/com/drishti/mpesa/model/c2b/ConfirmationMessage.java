package com.drishti.mpesa.model.c2b;

import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
public class ConfirmationMessage {
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
