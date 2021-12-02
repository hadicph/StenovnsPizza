package com.github.hadicph.stenovnspizza.repositories;

import com.github.hadicph.stenovnspizza.models.Order;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrderRepository implements IOrderRepository{


    //Sends a new order to the database
    @Override
    public void sendOrder(Order order) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("Order").setValue(order);
    }
}
