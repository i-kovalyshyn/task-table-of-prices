package com.home;

import java.time.Month;
import java.util.List;

public interface ProductService {
    public void addToTable(String productName, List<ProductKey> keys);
    public int getPrice(String productName, Month month);

 }
