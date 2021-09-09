package com.example.sb.store.repository;

import com.example.sb.store.model.PaymentMethod;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PaymentMethodRepository extends ReactiveMongoRepository<PaymentMethod, String> {

    Mono<PaymentMethod> findByIdAndClientId(String id, String clientId);
}
