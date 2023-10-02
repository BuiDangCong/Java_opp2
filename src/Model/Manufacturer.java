package Model;

public class Manufacturer {
        private String name_Manufacturer;
        private String Nation;

    public Manufacturer(String name_Manufacturer, String nation) {
        this.name_Manufacturer = name_Manufacturer;
        Nation = nation;
    }

    public String getName_Manufacturer() {
        return name_Manufacturer;
    }

    public void setName_Manufacturer(String name_Manufacturer) {
        this.name_Manufacturer = name_Manufacturer;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }
}
