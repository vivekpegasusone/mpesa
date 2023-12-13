package com.drishti.mpesa.services.c2b.impl;

import com.drishti.mpesa.model.c2b.TransactionConfirmation;
import com.drishti.mpesa.repository.c2b.TransactionConfirmationRepository;
import com.drishti.mpesa.services.c2b.TransactionConfirmationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionConfirmationServiceImpl implements TransactionConfirmationService {

    @Autowired
    private TransactionConfirmationRepository transactionConfirmationRepository;

    @Override
    public TransactionConfirmation persist(TransactionConfirmation confirmation) {
        return transactionConfirmationRepository.save(confirmation);
    }
}
