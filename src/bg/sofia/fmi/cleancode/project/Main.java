package bg.sofia.fmi.cleancode.project;


import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.product.Product;
import bg.sofia.fmi.cleancode.project.store.Store;

public class Main {


    public static void main(String[] args) {
        Store store = new Store();


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


    }

}
