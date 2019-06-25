package bg.sofia.fmi.cleancode.project.product;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.utils.Description;

public abstract class Clothes extends Product {

    protected ClothesSize size;
    protected Colour colour;
    protected double quantity;
    protected String description;

    public Clothes(Brand brand, double price, ClothesSize size, Colour colour, double quantity) {
        super(brand, price);
        this.quantity = quantity;
        this.colour = colour;
        this.size = size;
        description = Description.CLOTHES;
    }

    /**
     *
     * @return quantity in numbers
     */
    public double getQuantity() {
        return quantity;
    }

    public void printInformation() {
        super.printInformation();
    }

}
