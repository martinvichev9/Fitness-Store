package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.Description;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class ProteinBar extends Product {

    private Flavour flavour;
    private int quantity;
    private String description;

    public ProteinBar(Brand brand, double price, int count, Flavour flavour, int quantity) {
        super(brand, price, count);
        this.flavour = flavour;
        this.quantity = quantity;
        description = Description.PROTEIN_BAR;
    }

    public String getProductType() {
        return ProductType.PROTEIN_BAR;
    }

    @Override
    public void printInformation() {
        System.out.println("\nProduct type: " + ProductType.PROTEIN_BAR);
        super.printInformation();
        if (quantity < 1000) {
            System.out.println("Quantity: 0." + quantity + "g");
        } else {
            System.out.println("Quantity: " + quantity + "g");
        }
        System.out.println("Flavour: " + flavour);
        System.out.println("Description: " + description);
    }

}
