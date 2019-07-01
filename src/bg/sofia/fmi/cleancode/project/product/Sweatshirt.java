package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.utils.ProductType;

public class Sweatshirt extends Clothes {

    public Sweatshirt(Brand brand, double price, int count, ClothesSize size, Colour colour) {
        super(brand, price, count, size, colour);
    }

    public String getProductType() {
        return ProductType.SWEATSHIRT;
    }

    @Override
    public void printInformation() {
        System.out.println("\nProduct type: " + ProductType.SWEATSHIRT);
        super.printInformation();
        System.out.println("Size: " + size);
        System.out.println("Colour: " + colour);
        System.out.println("Description: " + description);

    }

}
