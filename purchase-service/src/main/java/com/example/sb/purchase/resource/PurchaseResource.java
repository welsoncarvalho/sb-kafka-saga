package com.example.sb.purchase.resource;

import com.example.sb.purchase.model.Purchase;
import com.example.sb.purchase.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/purchase")
public class PurchaseResource {

    private final PurchaseService purchaseService;

    @GetMapping("/{id}")
    public Mono<Purchase> get(@PathVariable("id") String id) {
        return purchaseService.get(id);
    }

    @PostMapping
    public Mono<Purchase> save(@RequestBody Purchase purchase) {
        return purchaseService.save(purchase);
    }
}
