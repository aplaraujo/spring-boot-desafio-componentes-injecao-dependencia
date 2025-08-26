package com.example.spring_boot_desafio_componentes_injecao_dependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_desafio_componentes_injecao_dependencia.entities.Order;

@Service
public class ShippingService {
    @Autowired
    private final OrderService orderService;

    public ShippingService(OrderService orderService) {
        this.orderService = orderService;
    }

    public double shipment(Order order) {
        double total, totalWithDiscount;
        total = orderService.total(order);
        if (total < 100) {
            totalWithDiscount = total + 20.00;
        } else if (total >= 100 && total < 200) {
            totalWithDiscount = total + 12.00;
        } else {
            totalWithDiscount = total;
        }
        return totalWithDiscount;
    }
}
