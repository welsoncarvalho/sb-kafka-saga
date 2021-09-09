package com.example.sb.store.repository;

import com.example.sb.store.model.Payment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PaymentRepository extends ReactiveMongoRepository<Payment, String> {

}
