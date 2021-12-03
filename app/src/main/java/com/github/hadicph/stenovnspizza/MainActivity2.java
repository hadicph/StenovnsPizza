package com.github.hadicph.stenovnspizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.github.hadicph.stenovnspizza.models.Product;
import com.github.hadicph.stenovnspizza.ui.order.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements ProductAdapter.OnListItemClickListener{

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Pizza", R.drawable.pizza_margherita));
        productList.add(new Product("Mexican Pizza", R.drawable.mexican_pizza));
        productList.add(new Product("Rice Meal", R.drawable.rice_meals));
        productList.add(new Product("Burger", R.drawable.burger_item));
        productList.add(new Product("Durum", R.drawable.durum_item));
        productList.add(new Product("Salad", R.drawable.salad_item));

        ProductAdapter adapter = new ProductAdapter(productList, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnClick(int position) {

    }
}