package com.drishti.mpesa.services.c2b;

import com.drishti.mpesa.model.c2b.TransactionConfirmation;

public interface TransactionConfirmationService {
    TransactionConfirmation persist(TransactionConfirmation confirmation);
}
