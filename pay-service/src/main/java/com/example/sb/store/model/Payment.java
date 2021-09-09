package com.example.sb.store.model;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Value
@Builder
public class Payment {

    @Id
    String id;
    Double value;
    String purchaseId;
    PaymentMethod method;
    LocalDateTime createdAt;
}
