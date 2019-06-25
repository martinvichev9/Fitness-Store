package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.Description;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class ProteinBar extends Product {

    private Flavour flavour;
    private double quantity;
    private String description;

    public ProteinBar(Brand brand, double price, Flavour flavour, double quantity) {
        super(brand, price);
        this.flavour = flavour;
        this.quantity = quantity;
        description = Description.PROTEIN_BAR;
    }

    /**
     *
     * @return quantity in grams
     */
    public double getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return ProductType.PROTEIN_BAR;
    }

    @Override
    public void printInformation() {
        System.out.println("Product type: " + ProductType.PROTEIN_BAR);
        super.printInformation();
        System.out.println("Quantity: " + quantity);
        System.out.println("Flavour: " + flavour);
        System.out.println("Description: " + description);
    }

}
