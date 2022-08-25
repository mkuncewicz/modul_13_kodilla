package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Mainv2 {
    public static void main(String[] args) {

            ProductOrderService productOrderService = new ProductOrderService(new InformationServicelmpl(), new OrderServicelmpl(), new OrderRepositorylmpl());
            productOrderService.process(new OrderRequest(new User("Jurek", "Killer"), LocalDateTime.now(),LocalDateTime.of(2023,11,10,5,12)));


    }
}
