package bg.sofia.fmi.cleancode.project;


import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Command;
import bg.sofia.fmi.cleancode.project.product.Product;
import bg.sofia.fmi.cleancode.project.store.Store;
import bg.sofia.fmi.cleancode.project.utils.Constants;

public class Main {


    public static void main(String[] args) {
        /*Store store = new Store();


        Product product = store.getProductByBrand("Protein", Brand.MYPROTEIN);
        product.printInformation();

        Product product1 = store.getProductByBrand("Protein bar", Brand.FIT_SPO);
        product1.printInformation();

        Product product2 = store.getProductByBrand("Amino acids", Brand.XTEND);
        product2.printInformation();

        Product product3 = store.getProductByBrand("BCAA", Brand.MYPROTEIN);
        product3.printInformation();

        Product product4 = store.getProductByBrand("T-shirt", Brand.TAPOUT);
        product4.printInformation();

        store.startShopping();

        System.out.println("We are pleased that you chose our shop. " +
                "Here is what we offer:\n\nMenu>"); */

       /* System.out.println(String.format("%15s", Command.BUY_PRODUCT.getCommand()));
        System.out.println(String.format("%16s", Command.SEARCH_BRAND.getCommand()));
        System.out.println(String.format("%18s", Command.SEARCH_PRODUCT.getCommand()));
        System.out.println(String.format("%14s", Command.VIEW_ORDER.getCommand()));
        System.out.println(String.format("%16s", Command.VIEW_PRODUCT.getCommand()));
        System.out.println(String.format("%8s", Command.EXIT.getCommand()));

        String id = "DADA";
        id = id.toLowerCase();
        System.out.println(id);

        */


       Store store = new Store();
       store.startShopping();



    }


}
