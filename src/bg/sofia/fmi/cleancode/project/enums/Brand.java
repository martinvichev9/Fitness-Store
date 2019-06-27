package bg.sofia.fmi.cleancode.project.enums;

public enum Brand {

    AMIX("Amix"),
    BATTERY("Battery"),
    BIOTECH_USA("Biotech USA"),
    CVETITA_HERBAL("Cvetita Herbal"),
    EVERBUILD("Everbuild"),
    FIT_SPO("Fit spo"),
    LONSDALE("Lonsdale"),
    MUSCLE_PHARM("Muscle pharm"),
    MYPROTEIN("Myprotein"),
    TAPOUT("Tapout"),
    XTEND("Xtend");

    private String brand;

    Brand(String brand) {
        this.brand = brand;
    }

    public String getBrandName() {
        return brand;
    }

}
