package com.example.spring_boot_desafio_componentes_injecao_dependencia.services;

import org.springframework.stereotype.Service;

import com.example.spring_boot_desafio_componentes_injecao_dependencia.entities.Order;

@Service
public class OrderService {
    
    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100);
    }
}
