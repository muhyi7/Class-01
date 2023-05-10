package programmer.zaman.now.application;

import programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {

        String name = "Eko";

        Product product = new Product("MacBook Pro M2", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
