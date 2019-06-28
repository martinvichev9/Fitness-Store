package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class Leggins extends Clothes {

    public Leggins(Brand brand, double price, int count, ClothesSize size, Colour colour) {
        super(brand, price, count, size, colour);
    }

    @Override
    public void printInformation() {
        System.out.println("\nProduct type: " + ProductType.LEGGINS);
        super.printInformation();
        System.out.println("Size: " + size);
        System.out.println("Colour: " + colour);
        System.out.println("Description: " + description);
    }

    public String getProductType() {
        return ProductType.LEGGINS;
    }

}
