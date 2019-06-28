package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.Description;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class AminoAcids extends Product {

    protected Flavour flavour;
    protected int quantity;
    protected String description;

    public AminoAcids(Brand brand, double price, int count, Flavour flavour, int quantity) {
        super(brand, price, count);
        this.flavour = flavour;
        this.quantity = quantity;
        this.description = Description.AMINO_ACIDS_AND_BCAA;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return ProductType.AMINO_ACIDS;
    }

    @Override
    public void printInformation() {
        System.out.println("\nProduct type: " + ProductType.AMINO_ACIDS);
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
