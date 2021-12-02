package com.github.hadicph.stenovnspizza.repositories;

import com.github.hadicph.stenovnspizza.models.Product;

import java.util.List;

public interface IProductsRepository {
    public List<Product> getPizza();
    public List<Product> getSpecialPizza();
    public List<Product> getMexicanPizza();
    public List<Product> getBakedPizza();
    public List<Product> getChildrensPizza();
    public List<Product> getRiceDishes();
    public List<Product> getPizzaSandwich();
    public List<Product> getBurger();
    public List<Product> getBarbecueDishes();
    public List<Product> getHomemadeDurum();
    public List<Product> getSnaks();
    public List<Product> getSalad();
    public List<Product> getDrinks();
    public List<Product> getDips();
}
