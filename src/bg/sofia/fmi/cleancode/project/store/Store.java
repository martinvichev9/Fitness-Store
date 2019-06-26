package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.product.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Store {

    private static final int PROTEINS_COUNT = 50;
    private static final int PROTEIN_BARS_COUNT = 200;
    private static final int AMINOS_COUNT = 200;
    private static final int BCAA_COUNT = 120;
    private static final int TSHIRTS_COUNT = 500;
    private static final int SHORTS_COUNT = 300;
    private static final int LEGGINS_COUNT = 70;
    private static final int SWEATSHIRTS_COUNT = 60;

    /**
     * Keys are the products,
     * values - how many products there are
     */
    private Map<Product, Integer> products;

    private Set<Brand> brands;

    public Store() {
        products = new HashMap<>();
        brands = new HashSet<>();
        buildStore();
    }

    private void buildStore() {
        addProteins();
        addProteinBars();
        addAminoAcids();
        addBCAA();
        addClothes();
    }
    private void addProteins() {

        Protein whey1 = new Protein(Brand.BATTERY, 123.34, PROTEINS_COUNT, Flavour.CHOCOLATE, 2);
        Protein whey2 = new Protein(Brand.AMIX, 65.41, PROTEINS_COUNT, Flavour.VANILLA, 1350);
        Protein whey3 = new Protein(Brand.MUSCLE_PHARM, 213.34, PROTEINS_COUNT, Flavour.CHOCOLATE, 5);
        Protein whey4 = new Protein(Brand.EVERBUILD, 150.67, PROTEINS_COUNT, Flavour.COOKIES, 2200);
        Protein whey5 = new Protein(Brand.MYPROTEIN, 89.89, PROTEINS_COUNT, Flavour.COCONUT, 980);

        addProduct(whey1);
        addProduct(whey2);
        addProduct(whey3);
        addProduct(whey4);
        addProduct(whey5);

    }
    private void addProteinBars() {

        ProteinBar bar1 = new ProteinBar(Brand.MYPROTEIN, 4.65, PROTEIN_BARS_COUNT,
                Flavour.CHOCOLATE, 400);
        ProteinBar bar2 = new ProteinBar(Brand.MYPROTEIN, 4.65, PROTEIN_BARS_COUNT,
                Flavour.ORANGE, 400);
        ProteinBar bar3 = new ProteinBar(Brand.AMIX, 2.23, PROTEIN_BARS_COUNT,
                Flavour.STRAWBERRY, 310);
        ProteinBar bar4 = new ProteinBar(Brand.FIT_SPO, 4.20, PROTEIN_BARS_COUNT,
                Flavour.CHOCOLATE, 330);
        ProteinBar bar5 = new ProteinBar(Brand.FIT_SPO, 5, PROTEIN_BARS_COUNT,
                Flavour.COCONUT, 400);

        addProduct(bar1);
        addProduct(bar2);
        addProduct(bar3);
        addProduct(bar4);
        addProduct(bar5);

    }
    private void addAminoAcids() {

        AminoAcids amino1 = new AminoAcids(Brand.XTEND, 34.78, AMINOS_COUNT, Flavour.ORANGE, 500);
        AminoAcids amino2 = new AminoAcids(Brand.MYPROTEIN, 30.21, AMINOS_COUNT, Flavour.NONE, 600);
        AminoAcids amino3 = new AminoAcids(Brand.XTEND, 17.45, AMINOS_COUNT, Flavour.STRAWBERRY, 300);
        AminoAcids amino4 = new AminoAcids(Brand.EVERBUILD, 26.50, AMINOS_COUNT, Flavour.COCONUT, 350);

        addProduct(amino1);
        addProduct(amino2);
        addProduct(amino3);
        addProduct(amino4);

    }
    private void addBCAA() {

        BCAA bcaa1 = new BCAA(Brand.XTEND, 40.69, BCAA_COUNT, Flavour.ORANGE, 400);
        BCAA bcaa2 = new BCAA(Brand.XTEND, 23.45, BCAA_COUNT, Flavour.ORANGE, 200);
        BCAA bcaa3 = new BCAA(Brand.MYPROTEIN, 50.32, BCAA_COUNT, Flavour.STRAWBERRY, 600);
        BCAA bcaa4 = new BCAA(Brand.BIOTECH_USA, 23.16, BCAA_COUNT, Flavour.ORANGE, 250);

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

        TShirt tShirt1 = new TShirt(Brand.LONSDALE, 22, TSHIRTS_COUNT, ClothesSize.L, Colour.RED);
        TShirt tShirt2 = new TShirt(Brand.LONSDALE, 22, TSHIRTS_COUNT, ClothesSize.XL, Colour.BLACK);
        TShirt tShirt3 = new TShirt(Brand.LONSDALE, 22, TSHIRTS_COUNT, ClothesSize.XXXL, Colour.WHITE);
        TShirt tShirt4 = new TShirt(Brand.LONSDALE, 22, TSHIRTS_COUNT, ClothesSize.S, Colour.RED);
        TShirt tShirt5 = new TShirt(Brand.LONSDALE, 22, TSHIRTS_COUNT, ClothesSize.M, Colour.RED);
        TShirt tShirt6 = new TShirt(Brand.LONSDALE, 22, TSHIRTS_COUNT, ClothesSize.XXL, Colour.WHITE);

        TShirt tShirt7 = new TShirt(Brand.TAPOUT, 30, TSHIRTS_COUNT, ClothesSize.L, Colour.BLACK);
        TShirt tShirt8 = new TShirt(Brand.TAPOUT, 30, TSHIRTS_COUNT, ClothesSize.XXXL, Colour.BLACK);
        TShirt tShirt9 = new TShirt(Brand.TAPOUT, 30, TSHIRTS_COUNT, ClothesSize.XXL, Colour.YELLOW);
        TShirt tShirt10 = new TShirt(Brand.TAPOUT, 30, TSHIRTS_COUNT, ClothesSize.XL, Colour.WHITE);
        TShirt tShirt11 = new TShirt(Brand.TAPOUT, 30, TSHIRTS_COUNT, ClothesSize.M, Colour.BLACK);

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

        Leggins l1 = new Leggins(Brand.TAPOUT, 20, LEGGINS_COUNT, ClothesSize.S, Colour.BLACK);
        Leggins l2 = new Leggins(Brand.LONSDALE, 20, LEGGINS_COUNT, ClothesSize.S, Colour.YELLOW);
        Leggins l3 = new Leggins(Brand.TAPOUT, 20, LEGGINS_COUNT, ClothesSize.XS, Colour.RED);

        addProduct(l1);
        addProduct(l2);
        addProduct(l3);

    }
    private void addShorts() {

        Shorts sh1 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.M, Colour.BLACK);
        Shorts sh2 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.XXL, Colour.BLACK);
        Shorts sh3 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.L, Colour.BLACK);
        Shorts sh4 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.M, Colour.RED);
        Shorts sh5 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.M, Colour.WHITE);
        Shorts sh6 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.XL, Colour.BLACK);
        Shorts sh7 = new Shorts(Brand.TAPOUT, 15, SHORTS_COUNT, ClothesSize.S, Colour.BLACK);

        addProduct(sh1);
        addProduct(sh2);
        addProduct(sh3);
        addProduct(sh4);
        addProduct(sh5);
        addProduct(sh6);
        addProduct(sh7);

    }
    private void addSweatshirts() {

        Sweatshirt sw1 = new Sweatshirt(Brand.MYPROTEIN, 45, SWEATSHIRTS_COUNT,
                ClothesSize.M, Colour.BLACK);
        Sweatshirt sw2 = new Sweatshirt(Brand.EVERBUILD, 30, SWEATSHIRTS_COUNT,
                ClothesSize.M, Colour.BLACK);
        Sweatshirt sw3 = new Sweatshirt(Brand.LONSDALE, 40, SWEATSHIRTS_COUNT,
                ClothesSize.M, Colour.RED);
        Sweatshirt sw4 = new Sweatshirt(Brand.LONSDALE, 40, SWEATSHIRTS_COUNT,
                ClothesSize.XL, Colour.BLACK);
        Sweatshirt sw5 = new Sweatshirt(Brand.LONSDALE, 40, SWEATSHIRTS_COUNT,
                ClothesSize.M, Colour.BLACK);
        Sweatshirt sw6 = new Sweatshirt(Brand.LONSDALE, 40, SWEATSHIRTS_COUNT,
                ClothesSize.M, Colour.WHITE);
        Sweatshirt sw7 = new Sweatshirt(Brand.TAPOUT, 55, SWEATSHIRTS_COUNT,
                ClothesSize.L, Colour.BLACK);
        Sweatshirt sw8 = new Sweatshirt(Brand.TAPOUT, 55, SWEATSHIRTS_COUNT,
                ClothesSize.M, Colour.BLACK);

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
        products.put(product, product.getCount());
        brands.add(product.getBrand());
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
