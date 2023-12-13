package com.drishti.mpesa.repository.c2b;

import com.drishti.mpesa.model.c2b.TransactionConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionConfirmationRepository extends JpaRepository<TransactionConfirmation, Long> {
}
