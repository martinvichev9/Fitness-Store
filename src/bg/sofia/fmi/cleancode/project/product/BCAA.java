package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class BCAA extends AminoAcids {

    public BCAA(Brand brand, double price, Flavour flavour, double quantity) {
        super(brand, price, flavour, quantity);
    }

    @Override
    public String getProductType() {
        return ProductType.BCAA;
    }

    @Override
    public void printInformation() {
        System.out.println("Product type: " + ProductType.BCAA);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Flavour: " + flavour);
        System.out.println("Description: " + description);
    }

}
