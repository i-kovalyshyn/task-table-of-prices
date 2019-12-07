package com.home;

import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ProductServiceImpl implements ProductService {

    Map<String, List<ProductKey>> priceExplorer;

    public ProductServiceImpl() {
        priceExplorer = new HashMap<>();
    }

    @Override
    public void addToTable(String productName, List<ProductKey> keys) {
        priceExplorer.put(productName, keys);
    }

    @Override
    public int getPrice(String productName, Month month) {
        List<ProductKey> keys = priceExplorer.get(productName);
        Predicate<ProductKey> keysPredicate = k -> k.getMonth() == month;
        ProductKey productKey = keys.stream().filter(keysPredicate).findFirst().get();
        return productKey.getPrice();
    }
}
