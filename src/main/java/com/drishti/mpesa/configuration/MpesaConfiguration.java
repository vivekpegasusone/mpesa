package com.drishti.mpesa.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class MpesaConfiguration {
    @Value("${consumer.key}")
    private String consumerkey;

    @Value("${consumer.secret}")
    private String consumerSecret;

    @Value("${grant.type}")
    private String grantType;

    @Value("${auth.endpoint}")
    private String authEndpoint;

}
