package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;

public abstract class Product {

    protected Brand brand;
    protected double price;

    public Product(Brand brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void printInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    /**
     * Depends on the chosen product(grams, numbers)
     * @return the quantity of a product
     */
    public abstract double getQuantity();

    public abstract String getProductType();

}
