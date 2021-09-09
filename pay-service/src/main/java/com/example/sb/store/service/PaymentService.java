package com.example.sb.store.service;

import com.example.sb.store.exception.PaymentException;
import com.example.sb.store.model.Payment;
import com.example.sb.store.model.PaymentMethod;
import com.example.sb.store.repository.PaymentMethodRepository;
import com.example.sb.store.repository.PaymentRepository;
import com.example.sb.store.schema.NewPurchase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMethodRepository paymentMethodRepository;

    public void doPayment(final NewPurchase newPurchase) {
        Mono.just(newPurchase)
                .zipWith(paymentMethodRepository.findByIdAndClientId(
                        newPurchase.getPayMethodId().toString(),
                        newPurchase.getClientId().toString()))
                .doOnNext(tuple -> verifyPaymentMethod(tuple.getT2()))
                .map(tuple -> Payment.builder()
                        .id(UUID.randomUUID().toString())
                        .value(tuple.getT1().getValue())
                        .purchaseId(tuple.getT1().getId().toString())
                        .method(tuple.getT2())
                        .createdAt(LocalDateTime.now())
                        .build())
                .flatMap(paymentRepository::save)
                .doOnSuccess(payment -> sendSuccess(newPurchase.getId().toString()))
                .doOnError(e -> sendError(newPurchase.getId().toString()));
    }

    private void verifyPaymentMethod(PaymentMethod paymentMethod) {
        if (paymentMethod == null || !paymentMethod.getEnabled())
            throw new PaymentException("invalid payment method");
    }

    private void sendSuccess(String id) {

    }

    private void sendError(String id) {

    }
}
