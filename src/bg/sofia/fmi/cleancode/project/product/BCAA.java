package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class BCAA extends AminoAcids {

    public BCAA(Brand brand, double price, int count, Flavour flavour, int quantity) {
        super(brand, price, count, flavour, quantity);
    }

    @Override
    public String getProductType() {
        return ProductType.BCAA;
    }

    @Override
    public void printInformation() {
        System.out.println("\nProduct type: " + ProductType.BCAA);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " lv");
        if (quantity < 1000) {
            System.out.println("Quantity: 0." + quantity + "g");
        } else {
            System.out.println("Quantity: " + quantity + "g");
        }
        System.out.println("Flavour: " + flavour);
        System.out.println("Description: " + description);

    }

}
