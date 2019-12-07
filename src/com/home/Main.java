package com.home;


import java.time.Month;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<ProductKey> productList1 = Arrays.asList(new ProductKey(Month.JANUARY, 1),
                new ProductKey(Month.FEBRUARY, 2),
                new ProductKey(Month.MARCH, 3),
                new ProductKey(Month.APRIL, 4),
                new ProductKey(Month.MAY, 44));
        List<ProductKey> productList2 = Arrays.asList(new ProductKey(Month.JANUARY, 5),
                new ProductKey(Month.FEBRUARY, 6),
                new ProductKey(Month.MARCH, 7),
                new ProductKey(Month.APRIL, 8),
                new ProductKey(Month.MAY, 88));
        List<ProductKey> productList3 = Arrays.asList(new ProductKey(Month.JANUARY, 10),
                new ProductKey(Month.FEBRUARY, 11),
                new ProductKey(Month.MARCH, 12),
                new ProductKey(Month.APRIL, 13),
                new ProductKey(Month.MAY, 14));

        ProductService service = new ProductServiceImpl();

        service.addToTable("Product1", productList1);
        service.addToTable("Product2", productList2);
        service.addToTable("Product3", productList3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name");

        String name = scanner.next();

        System.out.println("Enter month");

        Month month = Month.valueOf(scanner.next().toUpperCase());

        System.out.println("Price = " + service.getPrice(name, month));

    }
}