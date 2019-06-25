package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.Description;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class AminoAcids extends Product{

    protected Flavour flavour;
    protected double quantity;
    protected String description;

    public AminoAcids(Brand brand, double price, Flavour flavour, double quantity) {
        super(brand, price);
        this.flavour = flavour;
        this.quantity = quantity;
        this.description = Description.AMINO_ACIDS_AND_BCAA;
    }

    /**
     *
     * @return quantity in grams
     */
    public double getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return ProductType.AMINO_ACIDS;
    }

    @Override
    public void printInformation() {
        System.out.println("Product type: " + ProductType.AMINO_ACIDS);
        super.printInformation();
        System.out.println("Quantity: " + quantity);
        System.out.println("Flavour: " + flavour);
        System.out.println("Description: " + description);
    }

}
