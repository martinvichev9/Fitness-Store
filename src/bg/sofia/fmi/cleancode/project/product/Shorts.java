package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class Shorts extends Clothes {

    public Shorts(Brand brand, double price, ClothesSize size, Colour colour, double quantity) {
        super(brand, price, size, colour, quantity);
    }

    @Override
    public void printInformation() {
        System.out.println("Product type: " + ProductType.SHORTS);
        super.printInformation();
        System.out.println("Size: " + size);
        System.out.println("Colour: " + colour);
        System.out.println("Description: " + description);
    }

    public String getProductType() {
        return ProductType.SHORTS;
    }

}
