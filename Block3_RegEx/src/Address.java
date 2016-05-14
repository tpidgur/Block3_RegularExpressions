/**
 * @author Pidhurska Tetiana
 * @version 1 (created on 13.05.16)
 */
public class Address {
    private String zipCode,
            city,
            street,
            house,
            flat;

    /**
     * Returns address like
     * Lomonosova  26, 23
     * Kiev
     * 03022
     */
    public String getPostAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(street).append(" ").append(house).append(", ").append(flat).append("\n").append(city).
                append("\n").append(zipCode);
        return sb.toString();
    }

    /**
     * Returns address like
     * Kiev, Lomonosova 26, 23
     */
    public String getOrdinaryAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append(city).append(", ").append(street).append(" ").append(house).append(", ").append(flat);
        return sb.toString();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    /**
     *
     * @return the adress in 2 formats, by invoking getPostAddress()  and getOrdinaryAddress() methods
     */
    @Override
    public String toString() {
        return "Post Address:" + getPostAddress() +
                "\n Ordinary adress=" + getOrdinaryAddress();
    }
}
