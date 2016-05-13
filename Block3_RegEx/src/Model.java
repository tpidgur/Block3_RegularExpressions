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
    private String firstName,
            middleName,
            lastName,
            nickName,
            comments,
            homeNumber,
            cellPhone,
            eMail,
            skype,
            dataFirstEntered,
            dataModified;
    Group group;
    Address address;

    @Override
    public String toString() {
        return "Model{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comments='" + comments + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", eMail='" + eMail + '\'' +
                ", skype='" + skype + '\'' +
                ", dataFirstEntered='" + dataFirstEntered + '\'' +
                ", dataModified='" + dataModified + '\'' +
                ", group=" + group +
                ", address=" + address +
                '}';
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

    public String getDataFirstEntered() {
        return dataFirstEntered;
    }

    public void setDataFirstEntered(String dataFirstEntered) {
        this.dataFirstEntered = dataFirstEntered;
    }

    public String getDataModified() {
        return dataModified;
    }

    public void setDataModified(String dataModified) {
        this.dataModified = dataModified;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
