package com.github.hadicph.stenovnspizza.repositories;

import com.github.hadicph.stenovnspizza.models.Order;

public interface IOrderRepository {
    public void sendOrder(Order order);
}
