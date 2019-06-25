package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.product.*;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static int productId = 1;

    /**
     * Keys are the products, values - products' id
     */
    private Map<Product, Integer> products;

    public Store() {
        products = new HashMap<>();
        buildStore();
    }


    private void buyProduct() {
        //TODO
    }


    private void buildStore() {
        addProteins();
        addProteinBars();
        addAminoAcids();
        addBCAA();
        addClothes();
    }
    private void addProteins() {

        Protein whey1 = new Protein(Brand.BATTERY, 123.34, Flavour.CHOCOLATE, 2000);
        Protein whey2 = new Protein(Brand.AMIX, 65.41, Flavour.VANILLA, 1350);
        Protein whey3 = new Protein(Brand.MUSCLE_PHARM, 213.34, Flavour.CHOCOLATE, 5000);
        Protein whey4 = new Protein(Brand.EVERBUILD, 150.67, Flavour.COOKIES, 2200);
        Protein whey5 = new Protein(Brand.MYPROTEIN, 89.89, Flavour.COCONUT, 980);

        addProduct(whey1);
        addProduct(whey2);
        addProduct(whey3);
        addProduct(whey4);
        addProduct(whey5);

    }
    private void addProteinBars() {

        ProteinBar bar1 = new ProteinBar(Brand.MYPROTEIN, 4.65, Flavour.CHOCOLATE, 400);
        ProteinBar bar2 = new ProteinBar(Brand.MYPROTEIN, 4.65, Flavour.ORANGE, 400);
        ProteinBar bar3 = new ProteinBar(Brand.AMIX, 2.23, Flavour.STRAWBERRY, 310);
        ProteinBar bar4 = new ProteinBar(Brand.FIT_SPO, 4.20, Flavour.CHOCOLATE, 330);
        ProteinBar bar5 = new ProteinBar(Brand.FIT_SPO, 5, Flavour.COCONUT, 400);

        addProduct(bar1);
        addProduct(bar2);
        addProduct(bar3);
        addProduct(bar4);
        addProduct(bar5);

    }
    private void addAminoAcids() {

        AminoAcids amino1 = new AminoAcids(Brand.XTEND, 34.78, Flavour.ORANGE, 500);
        AminoAcids amino2 = new AminoAcids(Brand.MYPROTEIN, 30.21, Flavour.NONE, 600);
        AminoAcids amino3 = new AminoAcids(Brand.XTEND, 17.45, Flavour.STRAWBERRY, 300);
        AminoAcids amino4 = new AminoAcids(Brand.EVERBUILD, 26.50, Flavour.COCONUT, 350);

        addProduct(amino1);
        addProduct(amino2);
        addProduct(amino3);
        addProduct(amino4);

    }
    private void addBCAA() {

        BCAA bcaa1 = new BCAA(Brand.XTEND, 40.69, Flavour.ORANGE, 400);
        BCAA bcaa2 = new BCAA(Brand.XTEND, 23.45, Flavour.ORANGE, 200);
        BCAA bcaa3 = new BCAA(Brand.MYPROTEIN, 50.32, Flavour.STRAWBERRY, 600);
        BCAA bcaa4 = new BCAA(Brand.BIOTECH_USA, 23.16, Flavour.ORANGE, 250);

        addProduct(bcaa1);
        addProduct(bcaa2);
        addProduct(bcaa3);
        addProduct(bcaa4);

    }
    private void addClothes() {

        addTShirts();
        addLeggins();
        addShorts();
        addSweatshirts();

    }
    private void addTShirts() {

        TShirt tShirt1 = new TShirt(Brand.LONSDALE, 22, ClothesSize.L, Colour.RED, 16);
        TShirt tShirt2 = new TShirt(Brand.LONSDALE, 22, ClothesSize.XL, Colour.BLACK, 16);
        TShirt tShirt3 = new TShirt(Brand.LONSDALE, 22, ClothesSize.XXXL, Colour.WHITE, 16);
        TShirt tShirt4 = new TShirt(Brand.LONSDALE, 22, ClothesSize.S, Colour.RED, 16);
        TShirt tShirt5 = new TShirt(Brand.LONSDALE, 22, ClothesSize.M, Colour.RED, 16);
        TShirt tShirt6 = new TShirt(Brand.LONSDALE, 22, ClothesSize.XXL, Colour.WHITE, 16);

        TShirt tShirt7 = new TShirt(Brand.TAPOUT, 30, ClothesSize.L, Colour.BLACK, 15);
        TShirt tShirt8 = new TShirt(Brand.TAPOUT, 30, ClothesSize.XXXL, Colour.BLACK, 15);
        TShirt tShirt9 = new TShirt(Brand.TAPOUT, 30, ClothesSize.XXL, Colour.YELLOW, 15);
        TShirt tShirt10 = new TShirt(Brand.TAPOUT, 30, ClothesSize.XL, Colour.WHITE, 15);
        TShirt tShirt11 = new TShirt(Brand.TAPOUT, 30, ClothesSize.M, Colour.BLACK, 15);

        addProduct(tShirt1);
        addProduct(tShirt2);
        addProduct(tShirt3);
        addProduct(tShirt4);
        addProduct(tShirt5);
        addProduct(tShirt6);
        addProduct(tShirt7);
        addProduct(tShirt8);
        addProduct(tShirt9);
        addProduct(tShirt10);
        addProduct(tShirt11);

    }
    private void addLeggins() {

        Leggins l1 = new Leggins(Brand.TAPOUT, 20, ClothesSize.S, Colour.BLACK, 10);
        Leggins l2 = new Leggins(Brand.LONSDALE, 20, ClothesSize.S, Colour.YELLOW, 10);
        Leggins l3 = new Leggins(Brand.TAPOUT, 20, ClothesSize.XS, Colour.RED, 10);

        addProduct(l1);
        addProduct(l2);
        addProduct(l3);

    }
    private void addShorts() {

        Shorts sh1 = new Shorts(Brand.TAPOUT, 15, ClothesSize.M, Colour.BLACK, 20);
        Shorts sh2 = new Shorts(Brand.TAPOUT, 15, ClothesSize.XXL, Colour.BLACK, 20);
        Shorts sh3 = new Shorts(Brand.TAPOUT, 15, ClothesSize.L, Colour.BLACK, 20);
        Shorts sh4 = new Shorts(Brand.TAPOUT, 15, ClothesSize.M, Colour.RED, 20);
        Shorts sh5 = new Shorts(Brand.TAPOUT, 15, ClothesSize.M, Colour.WHITE, 20);
        Shorts sh6 = new Shorts(Brand.TAPOUT, 15, ClothesSize.XL, Colour.BLACK, 20);
        Shorts sh7 = new Shorts(Brand.TAPOUT, 15, ClothesSize.S, Colour.BLACK, 20);

        addProduct(sh1);
        addProduct(sh2);
        addProduct(sh3);
        addProduct(sh4);
        addProduct(sh5);
        addProduct(sh6);
        addProduct(sh7);

    }
    private void addSweatshirts() {

        Sweatshirt sw1 = new Sweatshirt(Brand.MYPROTEIN, 45, ClothesSize.M, Colour.BLACK, 9);
        Sweatshirt sw2 = new Sweatshirt(Brand.EVERBUILD, 30, ClothesSize.M, Colour.BLACK, 12);
        Sweatshirt sw3 = new Sweatshirt(Brand.LONSDALE, 40, ClothesSize.M, Colour.RED, 20);
        Sweatshirt sw4 = new Sweatshirt(Brand.LONSDALE, 40, ClothesSize.XL, Colour.BLACK, 20);
        Sweatshirt sw5 = new Sweatshirt(Brand.LONSDALE, 40, ClothesSize.M, Colour.BLACK, 20);
        Sweatshirt sw6 = new Sweatshirt(Brand.LONSDALE, 40, ClothesSize.M, Colour.WHITE, 20);
        Sweatshirt sw7 = new Sweatshirt(Brand.TAPOUT, 55, ClothesSize.L, Colour.BLACK, 9);
        Sweatshirt sw8 = new Sweatshirt(Brand.TAPOUT, 55, ClothesSize.M, Colour.BLACK, 9);

        addProduct(sw1);
        addProduct(sw2);
        addProduct(sw3);
        addProduct(sw4);
        addProduct(sw5);
        addProduct(sw6);
        addProduct(sw7);
        addProduct(sw8);

    }
    private void addProduct(Product product) {
        products.put(product, productId);
        ++productId;
    }

    public int getProductsNumber() {
        return products.size();
    }

    public boolean containsProductWithBrand(String product, Brand brand) {

        for (Product current : products.keySet()) {
            if (current.getBrand() == brand && current.getProductType().equals(product)) {
                return true;
            }
        }

        return false;
    }

    public Product getProductByBrand(String product, Brand brand) {

        for (Product current : products.keySet()) {
            if (current.getProductType().equals(product) && current.getBrand() == brand) {
                return current;
            }
        }

        return null;
    }



}
