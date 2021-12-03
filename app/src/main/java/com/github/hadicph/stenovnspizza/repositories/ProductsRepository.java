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

// Dorin Chira

public class ProductsRepository implements IProductsRepository {
    FirebaseDatabase database;
    DatabaseReference myRef;

    Product product;

    public ProductsRepository() {
        this.database = FirebaseDatabase.getInstance();
        this.product = new Product();
    }

    private List<Product> getAllProducts(){
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

    private List<Product> getProductsByCategory(String category, List<Product> productList){
        List<Product> list = new ArrayList<>();
        for(Product product : productList){
            if(product.getCategory().equals(category)) list.add(product);
        }
        return list;
    }

    @Override
    public List<Product> getDrinks() {
        return  getProductsByCategory("Drinks", getAllProducts());
    }

    @Override
    public List<Product> getDips() {
        return  getProductsByCategory("Dips", getAllProducts());
    }

    @Override
    public List<Product> getPizza() {
        return  getProductsByCategory("Pizza", getAllProducts());
    }

    @Override
    public List<Product> getSpecialPizza() {
        return  getProductsByCategory("Special Pizza", getAllProducts());
    }

    @Override
    public List<Product> getMexicanPizza() {
        return  getProductsByCategory("Mexican Pizza", getAllProducts());
    }

    @Override
    public List<Product> getBakedPizza() {
        return  getProductsByCategory("Baked Pizza", getAllProducts());
    }

    @Override
    public List<Product> getChildrensPizza() {
        return  getProductsByCategory("Childrens Pizza", getAllProducts());
    }

    @Override
    public List<Product> getRiceDishes() {
        return  getProductsByCategory("Rice Dishes", getAllProducts());
    }

    @Override
    public List<Product> getPizzaSandwich() {
        return  getProductsByCategory("Pizza Sandwich", getAllProducts());
    }

    @Override
    public List<Product> getBurger() {
        return  getProductsByCategory("Burger", getAllProducts());
    }

    @Override
    public List<Product> getBarbecueDishes() {
        return  getProductsByCategory("Barbecue Dishes", getAllProducts());
    }

    @Override
    public List<Product> getHomemadeDurum() {
        return  getProductsByCategory("Homemade Durum", getAllProducts());
    }

    @Override
    public List<Product> getSnaks() {
        return  getProductsByCategory("Snaks", getAllProducts());
    }

    @Override
    public List<Product> getSalad() {
        return  getProductsByCategory("Salad", getAllProducts());
    }
}
