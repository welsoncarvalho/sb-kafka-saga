package com.example.sb.purchase.repository;

import com.example.sb.purchase.model.Purchase;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PurchaseRepository extends ReactiveMongoRepository<Purchase, String> {
}
