package com.example.sb.purchase.service;

import com.example.sb.purchase.enums.PurchaseStatus;
import com.example.sb.purchase.model.Purchase;
import com.example.sb.purchase.publish.PurchasePublisher;
import com.example.sb.purchase.repository.PurchaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final PurchasePublisher purchasePublisher;

    public Mono<Purchase> save(Purchase purchase) {
        return Mono.just(purchase)
                .map(this::newPurchase)
                .flatMap(purchaseRepository::save)
                .doOnNext(purchasePublisher::publishNewPurchase);
    }

    private Purchase newPurchase(Purchase purchase) {
        return Purchase.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(LocalDateTime.now())
                .clientId(purchase.getClientId())
                .addressId(purchase.getAddressId())
                .contactId(purchase.getContactId())
                .status(PurchaseStatus.CREATED)
                .build();
    }

    public Mono<Purchase> get(String id) {
        return purchaseRepository.findById(id);
    }

}
