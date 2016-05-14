/**
 * A view generates an output presentation to the user based on changes in the model.
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 13.05.16)
 */

public class View {

    // Text's constants
    public static final String EMPTY_INPUT_DATA = "Empty input data! ";
    public static final String WRONG_INPUT= "Wrong input! Repeat please! ";
    public static final String INPUT_LAST_NAME="Enter your last name please (not more than 20 symbols). For example: Pidhurska, Ivanov-Arhipov ";
    public static final String INPUT_FIRST_NAME="Enter your first name please (not more than 20 symbols).  For example: Tetiana, Mariya-Antuanetta ";
    public static final String INPUT_MIDDLE_NAME="Enter your middle name please (not more than 20 symbols).  For example: Viktorivna ";
    public static final String INPUT_GROUP="Choose the number of your group please." +
            "Press \n 0 for FRIENDS ,\n 1 for FAMILY ,\n 2 for JOB_COLLEAGUES ,\n 3 for DOCTORS ,\n 4 for OTHER \n";

    public static final String INPUT_NICKNAME="Enter your nickname please (5 to 20  characters  [A-Za-z0-9_]). For example: teti89";
    public static final String INPUT_CELLPHONE="Enter your cellphone please (5 to 20 digits [0-9], symbol + or dash). For example: +38096-234-12-66, 23412 ";
    public static final String INPUT_HOMENUMBER="Enter your homenumber please(5 to 20 digits [0-9], symbol + or dash). For example: +38044-234-12-66, 23412  ";
    public static final String INPUT_EMAIL="Enter your email please. For example: pidhur_t.v.@its.kpi.ua, lileya15@gmail.com ";
    public static final String INPUT_SKYPE="Enter your skype please. For example: in_content, kate-lurry";

    public static final String INPUT_ZIP="Enter your zipcode please (5 numbers). For example: 03022 ";
    public static final String INPUT_CITY="Enter your city please. For example: Coeur d'Alene,  St. Thomas-Vincent ";
    public static final String INPUT_STREET="Enter your street please. For example: 40-Letiya Oktjabrja, Flora ";
    public static final String INPUT_HOUSE="Enter the number of your house please. For example: 15, 100-k ";
    public static final String INPUT_FLAT="Enter your flat please. For example: 15, 100-k ";
    public static final String INPUT_COMMENTS ="Leave your comments or skip this step by pressing enter!";
    public static final String OUTPUT_DATA="You entered the following data: ";


    /**
     * prints the corresponding message
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }


    /**
     * method used to return the string representation of the Model object
     * @param m
     * @return
     */
    public String toString(Model m) {
        return m.toString();
    }
}
