package com.example.sb.purchase.listener;

import com.example.sb.purchase.schema.NewPurchase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PurchaseListener {

    @KafkaListener(topics = "${kafka.newPurchaseTopic}")
    public void receiveNewPurchase(NewPurchase newPurchase) {
        log.info("receiving new purchase: " + newPurchase.toString());
    }
}
