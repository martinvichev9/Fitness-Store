package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.Description;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class Protein extends Product {

    private Flavour flavour;
    private double quantity;
    private String description;

    public Protein(Brand brand, double price, Flavour flavour, double quantity) {
        super(brand, price);
        this.flavour = flavour;
        this.quantity = quantity;
        description = Description.PROTEIN;
    }

    /**
     *
     * @return quantity in grams
     */
    public double getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return ProductType.PROTEIN;
    }

    @Override
    public void printInformation() {
        System.out.println("Product type: " + ProductType.PROTEIN);
        super.printInformation();
        System.out.println("Quantity(in grams): " + quantity);
        System.out.println("Flavour: " + flavour);
        System.out.println("Description: " + description);
    }

}
