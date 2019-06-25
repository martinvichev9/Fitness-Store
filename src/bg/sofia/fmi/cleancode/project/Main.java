package bg.sofia.fmi.cleancode.project;


import bg.sofia.fmi.cleancode.project.store.Store;

public class Main {


    public static void main(String[] args) {
        Store store = new Store();

        System.out.println(store.getProductsNumber());
    }

}
