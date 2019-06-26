package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.utils.Description;

public abstract class Clothes extends Product {

    protected ClothesSize size;
    protected Colour colour;
    protected String description;

    public Clothes(Brand brand, double price, int count, ClothesSize size, Colour colour) {
        super(brand, price, count);
        this.colour = colour;
        this.size = size;
        description = Description.CLOTHES;
    }

    public void printInformation() {
        super.printInformation();
    }

}
