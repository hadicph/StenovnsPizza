package com.github.hadicph.stenovnspizza.repositories;

import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.github.hadicph.stenovnspizza.R;
import com.github.hadicph.stenovnspizza.models.Product;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepository implements IProductsRepository {
    FirebaseDatabase database;
    DatabaseReference myRef;

    Product product;

    public ProductsRepository() {
        this.database = FirebaseDatabase.getInstance();
        this.product = new Product();
    }

    @Override
    public List<Product> getDrinks() {
        return null;
    }

    @Override
    public List<Product> getPizza() {
        myRef = database.getReference("Products");
        List<Product> productList = new ArrayList<>();



        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    product = ds.getValue(Product.class);
                    productList.add(product);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        return productList;
    }
}
