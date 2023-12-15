package com.drishti.mpesa.controllers.c2b;

import com.drishti.mpesa.model.c2b.TransactionConfirmation;
import com.drishti.mpesa.model.c2b.ValidationMessage;
import com.drishti.mpesa.model.c2b.ValidationResponse;
import com.drishti.mpesa.services.c2b.TransactionConfirmationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("c2b")
public class CustomerBuyGoodsOnline {

    private static final Logger log = LoggerFactory.getLogger(CustomerBuyGoodsOnline.class);

    @Autowired
    private TransactionConfirmationService transConfService;

    @PostMapping(path = "validate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    public ValidationResponse validate(@RequestBody ValidationMessage message) {
        /*
         * If External Validation is disabled this method will not be called.
         * By default, it is disabled.
         */
        return new ValidationResponse();
    }

    @PostMapping(path = "confirmation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void confirmation(@RequestBody ValidationMessage message) throws JsonProcessingException, ParseException {
        log.info("Received validation message : " + message);
        TransactionConfirmation confirmation =  transConfService.persist(new TransactionConfirmation(message));
        log.info("Persisted confirmation message: " + confirmation);
    }
}
