package com.github.hadicph.stenovnspizza.repositories;

import com.github.hadicph.stenovnspizza.models.Product;

import java.util.List;

public interface IProductsRepository {
    public List<Product> getDrinks();
    public List<Product> getPizza();
}
