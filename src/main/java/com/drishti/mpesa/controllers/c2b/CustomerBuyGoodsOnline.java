package com.drishti.mpesa.controllers.c2b;

import com.drishti.mpesa.model.c2b.ConfirmationMessage;
import com.drishti.mpesa.model.c2b.ValidationMessage;
import com.drishti.mpesa.model.c2b.ValidationResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("c2b")
public class CustomerBuyGoodsOnline {

    @GetMapping(path = "validate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ValidationResponse validate(@RequestBody ValidationMessage message){
       /*
       * If External Validation is disabled this method will not be called.
       * By default, it is disabled.
       */
        ValidationResponse response = new ValidationResponse();
        return response;
    }

    @GetMapping(path = "confirmation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void confirmation(@RequestBody ValidationMessage message) throws JsonProcessingException {
        System.out.println("***************************");
        System.out.println(message);
        //ObjectMapper mapper = new ObjectMapper();
        //ValidationMessage validationMessage = mapper.readValue(message, ValidationMessage.class);
        //System.out.println(validationMessage);
        System.out.println("***************************");
    }
}
