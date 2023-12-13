package com.drishti.mpesa.model.c2b;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Data
@Jacksonized
@Entity
@Table(name = "transaction_confirmation")
public class TransactionConfirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String transId;
    private String transactionType;
    private Double transAmount;
    private LocalDateTime transTime;
    private String businessShortCode;
    private String billRefNumber;
    private String invoiceNumber;
    private Double orgAccountBalance;
    private String thirdPartyTransId;
    private String msisdn;
    private String firstName;
    private String middleName;
    private String lastName;

    public TransactionConfirmation() {
    }

    public TransactionConfirmation(ValidationMessage message) throws ParseException {
        this.setTransId(message.getTransId());
        this.setTransactionType(message.getTransactionType());
        this.setTransAmount(parseDouble(message.getTransAmount()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse(message.getTransTime());
        this.setTransTime(Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());

        this.setBusinessShortCode(message.getBusinessShortCode());
        this.setBillRefNumber(message.getBillRefNumber());
        this.setInvoiceNumber(message.getInvoiceNumber());
        this.setOrgAccountBalance(parseDouble(message.getOrgAccountBalance()));
        this.setThirdPartyTransId(message.getThirdPartyTransId());
        this.setMsisdn(message.getMsisdn());
        this.setFirstName(message.getFirstName());
        this.setMiddleName(message.getMiddleName());
        this.setLastName(message.getLastName());
    }

    private Double parseDouble(String doubleValue) {
        if(StringUtils.hasText(doubleValue)) {
            return Double.parseDouble(doubleValue);
        } else {
            return null;
        }

    }
}
