package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.enums.Brand;
import bg.sofia.fmi.cleancode.project.enums.ClothesSize;
import bg.sofia.fmi.cleancode.project.enums.Colour;
import bg.sofia.fmi.cleancode.project.enums.Flavour;
import bg.sofia.fmi.cleancode.project.product.*;
import bg.sofia.fmi.cleancode.project.utils.StoreConstants;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Store {

    /**
     * Keys are the products,
     * values - how many products there are
     */
    private Map<Product, Integer> products;

    private Set<String> brands;

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

        Protein whey1 = new Protein(Brand.BATTERY, StoreConstants.PROTEIN_PRICE_ONE,
                StoreConstants.PROTEINS_COUNT, Flavour.CHOCOLATE, StoreConstants.PROTEIN_QUANTITY_FOUR);
        Protein whey2 = new Protein(Brand.AMIX, StoreConstants.PROTEIN_PRICE_FOUR,
                StoreConstants.PROTEINS_COUNT, Flavour.VANILLA, StoreConstants.PROTEIN_QUANTITY_ONE);
        Protein whey3 = new Protein(Brand.MUSCLE_PHARM, StoreConstants.PROTEIN_PRICE_THREE,
                StoreConstants.PROTEINS_COUNT, Flavour.CHOCOLATE, StoreConstants.PROTEIN_QUANTITY_THREE);
        Protein whey4 = new Protein(Brand.EVERBUILD, StoreConstants.PROTEIN_PRICE_ONE,
                StoreConstants.PROTEINS_COUNT, Flavour.COOKIES, StoreConstants.PROTEIN_QUANTITY_FOUR);
        Protein whey5 = new Protein(Brand.MYPROTEIN, StoreConstants.PROTEIN_PRICE_TWO,
                StoreConstants.PROTEINS_COUNT, Flavour.COCONUT, StoreConstants.PROTEIN_QUANTITY_TWO);

        addProduct(whey1);
        addProduct(whey2);
        addProduct(whey3);
        addProduct(whey4);
        addProduct(whey5);

    }

    private void addProteinBars() {

        ProteinBar bar1 = new ProteinBar(Brand.MYPROTEIN, StoreConstants.PROTEIN_BAR_PRICE_ONE,
                StoreConstants.PROTEIN_BARS_COUNT, Flavour.CHOCOLATE, StoreConstants.PROTEIN_BAR_QUANTITY);
        ProteinBar bar2 = new ProteinBar(Brand.MYPROTEIN, StoreConstants.PROTEIN_BAR_PRICE_ONE,
                StoreConstants.PROTEIN_BARS_COUNT, Flavour.ORANGE, StoreConstants.PROTEIN_BAR_QUANTITY);
        ProteinBar bar3 = new ProteinBar(Brand.AMIX, StoreConstants.PROTEIN_BAR_PRICE_TWO,
                StoreConstants.PROTEIN_BARS_COUNT, Flavour.STRAWBERRY, StoreConstants.PROTEIN_BAR_QUANTITY);
        ProteinBar bar4 = new ProteinBar(Brand.FIT_SPO, StoreConstants.PROTEIN_BAR_PRICE_THREE,
                StoreConstants.PROTEIN_BARS_COUNT, Flavour.CHOCOLATE, StoreConstants.PROTEIN_BAR_QUANTITY);
        ProteinBar bar5 = new ProteinBar(Brand.FIT_SPO, StoreConstants.PROTEIN_BAR_PRICE_FOUR,
                StoreConstants.PROTEIN_BARS_COUNT, Flavour.COCONUT, StoreConstants.PROTEIN_BAR_QUANTITY);

        addProduct(bar1);
        addProduct(bar2);
        addProduct(bar3);
        addProduct(bar4);
        addProduct(bar5);

    }

    private void addAminoAcids() {

        AminoAcids amino1 = new AminoAcids(Brand.XTEND, StoreConstants.AMINO_PRICE_ONE,
                StoreConstants.AMINOS_COUNT, Flavour.ORANGE, StoreConstants.AMINO_BCAA_QUANTITY_ONE);
        AminoAcids amino2 = new AminoAcids(Brand.MYPROTEIN, StoreConstants.AMINO_PRICE_TWO,
                StoreConstants.AMINOS_COUNT, Flavour.NONE, StoreConstants.AMINO_BCAA_QUANTITY_ONE);
        AminoAcids amino3 = new AminoAcids(Brand.XTEND, StoreConstants.AMINO_PRICE_THREE,
                StoreConstants.AMINOS_COUNT, Flavour.STRAWBERRY, StoreConstants.AMINO_BCAA_QUANTITY_TWO);
        AminoAcids amino4 = new AminoAcids(Brand.EVERBUILD, StoreConstants.AMINO_PRICE_THREE,
                StoreConstants.AMINOS_COUNT, Flavour.COCONUT, StoreConstants.AMINO_BCAA_QUANTITY_ONE);

        addProduct(amino1);
        addProduct(amino2);
        addProduct(amino3);
        addProduct(amino4);

    }

    private void addBCAA() {

        BCAA bcaa1 = new BCAA(Brand.XTEND, StoreConstants.BCAA_PRICE_ONE, StoreConstants.BCAA_COUNT,
                Flavour.ORANGE, StoreConstants.AMINO_BCAA_QUANTITY_ONE);
        BCAA bcaa2 = new BCAA(Brand.XTEND, StoreConstants.BCAA_PRICE_THREE, StoreConstants.BCAA_COUNT,
                Flavour.ORANGE, StoreConstants.AMINO_BCAA_QUANTITY_TWO);
        BCAA bcaa3 = new BCAA(Brand.MYPROTEIN, StoreConstants.BCAA_PRICE_ONE, StoreConstants.BCAA_COUNT,
                Flavour.STRAWBERRY, StoreConstants.AMINO_BCAA_QUANTITY_ONE);
        BCAA bcaa4 = new BCAA(Brand.BIOTECH_USA, StoreConstants.BCAA_PRICE_TWO, StoreConstants.BCAA_COUNT,
                Flavour.ORANGE, StoreConstants.AMINO_BCAA_QUANTITY_TWO);

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

        TShirt tShirt1 = new TShirt(Brand.LONSDALE, StoreConstants.LONSDALE_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.L, Colour.RED);
        TShirt tShirt2 = new TShirt(Brand.LONSDALE, StoreConstants.LONSDALE_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.XL, Colour.BLACK);
        TShirt tShirt3 = new TShirt(Brand.LONSDALE, StoreConstants.LONSDALE_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.XXXL, Colour.WHITE);
        TShirt tShirt4 = new TShirt(Brand.LONSDALE, StoreConstants.LONSDALE_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.S, Colour.RED);
        TShirt tShirt5 = new TShirt(Brand.LONSDALE, StoreConstants.LONSDALE_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.M, Colour.RED);
        TShirt tShirt6 = new TShirt(Brand.LONSDALE, StoreConstants.LONSDALE_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.XXL, Colour.WHITE);

        TShirt tShirt7 = new TShirt(Brand.TAPOUT, StoreConstants.TAPOUT_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.L, Colour.BLACK);
        TShirt tShirt8 = new TShirt(Brand.TAPOUT, StoreConstants.TAPOUT_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.XXXL, Colour.BLACK);
        TShirt tShirt9 = new TShirt(Brand.TAPOUT, StoreConstants.TAPOUT_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.XXL, Colour.YELLOW);
        TShirt tShirt10 = new TShirt(Brand.TAPOUT, StoreConstants.TAPOUT_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.XL, Colour.WHITE);
        TShirt tShirt11 = new TShirt(Brand.TAPOUT, StoreConstants.TAPOUT_TSHIRT_PRICE,
                StoreConstants.TSHIRTS_COUNT, ClothesSize.M, Colour.BLACK);

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

        Leggins l1 = new Leggins(Brand.TAPOUT, StoreConstants.LEGGINS_PRICE,
                StoreConstants.LEGGINS_COUNT, ClothesSize.S, Colour.BLACK);
        Leggins l2 = new Leggins(Brand.LONSDALE, StoreConstants.LEGGINS_PRICE,
                StoreConstants.LEGGINS_COUNT, ClothesSize.S, Colour.YELLOW);
        Leggins l3 = new Leggins(Brand.TAPOUT, StoreConstants.LEGGINS_PRICE,
                StoreConstants.LEGGINS_COUNT, ClothesSize.XS, Colour.RED);

        addProduct(l1);
        addProduct(l2);
        addProduct(l3);

    }

    private void addShorts() {

        Shorts sh1 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.M, Colour.BLACK);
        Shorts sh2 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.XXL, Colour.BLACK);
        Shorts sh3 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.L, Colour.BLACK);
        Shorts sh4 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.M, Colour.RED);
        Shorts sh5 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.M, Colour.WHITE);
        Shorts sh6 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.XL, Colour.BLACK);
        Shorts sh7 = new Shorts(Brand.TAPOUT, StoreConstants.SHORTS_PRICE,
                StoreConstants.SHORTS_COUNT, ClothesSize.S, Colour.BLACK);

        addProduct(sh1);
        addProduct(sh2);
        addProduct(sh3);
        addProduct(sh4);
        addProduct(sh5);
        addProduct(sh6);
        addProduct(sh7);

    }

    private void addSweatshirts() {

        Sweatshirt sw1 = new Sweatshirt(Brand.MYPROTEIN, StoreConstants.SWEATSHIRT_PRICE_ONE,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.M, Colour.BLACK);
        Sweatshirt sw2 = new Sweatshirt(Brand.EVERBUILD, StoreConstants.SWEATSHIRT_PRICE_ONE,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.M, Colour.BLACK);
        Sweatshirt sw3 = new Sweatshirt(Brand.LONSDALE, StoreConstants.SWEATSHIRT_PRICE_TWO,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.M, Colour.RED);
        Sweatshirt sw4 = new Sweatshirt(Brand.LONSDALE, StoreConstants.SWEATSHIRT_PRICE_ONE,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.XL, Colour.BLACK);
        Sweatshirt sw5 = new Sweatshirt(Brand.LONSDALE, StoreConstants.SWEATSHIRT_PRICE_TWO,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.M, Colour.BLACK);
        Sweatshirt sw6 = new Sweatshirt(Brand.LONSDALE, StoreConstants.SWEATSHIRT_PRICE_TWO,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.M, Colour.WHITE);
        Sweatshirt sw7 = new Sweatshirt(Brand.TAPOUT, StoreConstants.SWEATSHIRT_PRICE_ONE,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.L, Colour.BLACK);
        Sweatshirt sw8 = new Sweatshirt(Brand.TAPOUT, StoreConstants.SWEATSHIRT_PRICE_TWO,
                StoreConstants.SWEATSHIRTS_COUNT, ClothesSize.M, Colour.BLACK);

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
        brands.add(product.getBrand().getBrandName().toLowerCase());

    }

    public void startShopping() {
        new Shopping(products, brands).run();
    }

}
