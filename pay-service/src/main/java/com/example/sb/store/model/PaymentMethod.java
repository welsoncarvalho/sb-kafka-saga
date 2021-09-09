package com.example.sb.store.model;

import com.example.sb.store.enums.PayType;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Value
@Builder
public class PaymentMethod {

    @Id
    String id;
    PayType type;
    String cardNumber;
    String secCode;
    Boolean enabled;
    String clientId;
    LocalDateTime createdAt;
}
