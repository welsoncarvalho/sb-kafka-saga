package com.example.sb.purchase.publish;

import com.example.sb.purchase.model.Purchase;
import com.example.sb.purchase.schema.NewPurchase;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PurchasePublisher {

    @Value("${kafka.newPurchaseTopic}")
    private String newPurchaseTopic;

    private final KafkaTemplate<String, SpecificRecord> newPurchasePublisher;

    public PurchasePublisher(KafkaTemplate<String, SpecificRecord> newPurchasePublisher) {
        this.newPurchasePublisher = newPurchasePublisher;
    }

    public void publishNewPurchase(Purchase purchase) {
        log.info("sending new purchase: " + purchase.getId());

        newPurchasePublisher.send(newPurchaseTopic, NewPurchase.newBuilder()
                .setId(purchase.getId())
                .setClientId(purchase.getClientId())
                .build());
    }

}
