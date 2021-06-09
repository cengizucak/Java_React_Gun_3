package com.javaintro;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenova v14", 15000,
                "16 gb Ram", 10.0);


        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenevo 15");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrise(16000);

        Product product3 = new Product(11, "AAA", 14000, "WW", 20.0);

        System.out.println(product2.getUnitPriceAfterDiscount());
        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println(product3.getUnitPriceAfterDiscount());
        System.out.println(product2.getId());
/*
        Product product3 = new Product();


        Product product4 = new Product();



        Product[] products = {product1, product2, product3, product4};

        for (Product product : products) {
           System.out.println(product.name);
            System.out.println(product.id);
            System.out.println(product.unitPrise);
            System.out.println(product.detail);


        }*/

        // System.out.println(products.length);

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Icecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");


        ProductManager manager = new ProductManager();
        manager.addToCart(product1);
        manager.addToCart(product2);

        System.out.println("Kategori eklendi: " + category2.getId());
        System.out.println("Kategori eklendi: " + category2.getName());

        System.out.println();


        System.out.println("Total       : "+(25812 * 12));
        System.out.println("Efter skatt : "+(19244*12));
        System.out.println("Skatt       : "+(309744-230928));




    }
}
