/**
 * In this class the program logic is demonstrated.
 * This class accumulates  data about users
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 13.05.16)
 */
public class Model {
    /**
     * the components of the noteBook
     */
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String comments;
    private String homeNumber;
    private String cellPhone;
    private String eMail;
    private String skype;
    private String registrationDate;
    Group group;
    Address address;

    @Override
    public String toString() {
        return "Name='" + getFormatedFullName() + '\'' +
                ",\n nickName='" + nickName + '\'' +
                ",\n comments='" + comments + '\'' +
                ",\n homeNumber='" + homeNumber + '\'' +
                ",\n cellPhone='" + cellPhone + '\'' +
                ",\n eMail='" + eMail + '\'' +
                ",\n skype='" + skype + '\'' +
                ",\n Registration date='" + registrationDate + '\'' +
                ",\n group=" + group +
                ",\n " + address;
    }

    /**
     * @return the formatted Name
     * For example: Pidhurska T. V.
     */
    public String getFormatedFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(" ").append(firstName.charAt(0)).append(". ").append(middleName.charAt(0)).append(".");
        return sb.toString();
    }

    /**
     * the Adress object is created with the corresponding fields:
     *
     * @param zipCode
     * @param city
     * @param street
     * @param house
     * @param flat
     */
    public void setFormattedFullAdress(String zipCode, String city, String street, String house, String flat) {
        address = new Address();
        address.setZipCode(zipCode);
        address.setCity(city);
        address.setStreet(street);
        address.setHouse(house);
        address.setFlat(flat);
    }

    /**
     * the corresponding ENUM constant is chosen based on the index of the element in array, to which this constant corresponds
     *
     * @param number
     */
    public void setGroup(int number) {
        this.group = Group.values()[number];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }


    public Group getGroup() {
        return group;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

}
