package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;

public abstract class Product {

    protected Brand brand;
    protected double price;
    protected int count;

    public Product(Brand brand, double price, int count) {
        this.brand = brand;
        this.price = price;
        this.count = count;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getCount() {
        return count;
    }

    /**
     * That method will be implemented in all derived classes.
     * @return type of product
     */
    public abstract String getProductType();

    public void printInformation() {
        System.out.println("Brand: " + brand.getBrandName());
        System.out.println("Price: " + price + " lv");

    }

}
