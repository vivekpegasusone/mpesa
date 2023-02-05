package com.drishti.mpesa.model.c2b;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ValidationMessage {
    @JsonProperty(value = "TransactionType")
    private String transactionType;
    @JsonProperty(value = "TransID")
    private String transId;
    @JsonProperty(value = "TransTime")
    private String transTime;
    @JsonProperty(value = "TransAmount")
    private String transAmount;
    @JsonProperty(value = "BusinessShortCode")
    private String businessShortCode;
    @JsonProperty(value = "BillRefNumber")
    private String billRefNumber;
    @JsonProperty(value = "InvoiceNumber")
    private String invoiceNumber;
    @JsonProperty(value = "OrgAccountBalance")
    private String orgAccountBalance;
    @JsonProperty(value = "ThirdPartyTransID")
    private String thirdPartyTransId;
    @JsonProperty(value = "MSISDN")
    private String msisdn;
    @JsonProperty(value = "FirstName")
    private String firstName;
}
