package inheritance2;

public class Main {

    public static void main(String[] args) {


        Product product = new Product(3,"Leptop",
                "WWW",5500,2,"AAA");

        product.setId(1);
        product.setName("Leptop");
        product.setDespription("Leptop");



        ProductManager manager = new ProductManager();
        manager.add(product);
        System.out.println(product.getKod());


    }
}
