package Utils;

import Utils.Region;

public class Country {

    private String name_country;
    private Region regional_indicate;
    private double SpecialSupport;
    private double Healthy_life_expectancy;
    private double Fredom_to_make_choises;
    private double Generosity;
    private double Perception_of_corruption;

    public Country(String name_country, Region regional_indicate, double specialSupport, double healthy_life_expectancy,
                   double fredom_to_make_choises, double generosity, double perception_of_corruption) {
        this.name_country = name_country;
        this.regional_indicate = regional_indicate;
        this.SpecialSupport = specialSupport;
        this.Healthy_life_expectancy = healthy_life_expectancy;
        this.Fredom_to_make_choises = fredom_to_make_choises;
        this.Generosity = generosity;
        this.Perception_of_corruption = perception_of_corruption;
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    public Region getRegional_indicate() {
        return regional_indicate;
    }

    public void setRegional_indicate(Region regional_indicate) {
        this.regional_indicate = regional_indicate;
    }

    public double getSpecialSupport() {
        return SpecialSupport;
    }

    public void setSpecialSupport(double specialSupport) {
        SpecialSupport = specialSupport;
    }

    public double getHealthy_life_expectancy() {
        return Healthy_life_expectancy;
    }

    public void setHealthy_life_expectancy(double healthy_life_expectancy) {
        Healthy_life_expectancy = healthy_life_expectancy;
    }

    public double getFredom_to_make_choises() {
        return Fredom_to_make_choises;
    }

    public void setFredom_to_make_choises(double fredom_to_make_choises) {
        Fredom_to_make_choises = fredom_to_make_choises;
    }

    public double getGenerosity() {
        return Generosity;
    }

    public void setGenerosity(double generosity) {
        Generosity = generosity;
    }

    public double getPerception_of_corruption() {
        return Perception_of_corruption;
    }

    public void setPerception_of_corruption(double perception_of_corruption) {
        Perception_of_corruption = perception_of_corruption;
    }
}
