package Utils;

import java.util.ArrayList;

public class Region {

    private String name_Region;
    ArrayList<Country> countries;

    public Region(String name_Region) {
        this.name_Region = name_Region;
        this.countries = new ArrayList<Country>();
    }

    public String getName_Region() {
        return name_Region;
    }

    public void setName_Region(String name_Region) {
        this.name_Region = name_Region;
    }
}
