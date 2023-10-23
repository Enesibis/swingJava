public class City {
    private int id;
    private String name;
    private String countryCode;
    private String disctrict;
    private int population;

    public City(int id, String name, String countryCode, String disctrict, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.disctrict = disctrict;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDisctrict() {
        return disctrict;
    }

    public void setDisctrict(String disctrict) {
        this.disctrict = disctrict;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
