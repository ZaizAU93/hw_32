package org.example.PatternSessionFacade;

import org.example.Order;
import org.example.PatternDTO.OrderDTO;

public class SessionFacadeOrder {
    OrderDTO dto;
    Order order;

    public SessionFacadeOrder(OrderDTO dto) {
        this.dto = dto;
        this.order = new Order(dto.getFood(), dto.getDrink());
    }

    public Order priceOrder() {
        if (order.getFood().equals("pizza")) {
            order.setPriceFood(20.5);
        } else if (order.getFood().equals("chaur")) {
            order.setPriceFood(25.5);
        }
        if (order.getDrink().equals("cola")) {
            order.setPriceDrink(10.5);
        } else if (order.getDrink().equals("pepsi")) {
            order.setPriceFood(5.5);
        }

        return new Order(dto.getFood(), dto.getDrink(),order.getPriceFood() + order.getPriceDrink());
    }
}
