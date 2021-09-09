package com.example.sb.purchase.model;

import com.example.sb.purchase.enums.PurchaseStatus;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Value
@Builder
public class Purchase {

    @Id
    String id;
    LocalDateTime createdAt;
    String clientId;
    String addressId;
    String contactId;
    PurchaseStatus status;
}
