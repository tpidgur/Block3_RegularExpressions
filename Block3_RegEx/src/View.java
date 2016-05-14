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
    public static final String INPUT_LAST_NAME="Enter your last name please: ";
    public static final String INPUT_FIRST_NAME="Enter your first name please: ";
    public static final String INPUT_MIDDLE_NAME="Enter your middle name please: ";
    public static final String INPUT_GROUP="Choose the number of your group please:" +
            "Press 0 for FRIENDS ,\n 1 for FAMILY ,\n 2 for JOB_COLLEAGUES ,\n 3 for DOCTORS ,\n 4 for OTHER \n";

    public static final String INPUT_NICKNAME="Enter your nickname please: ";
    public static final String INPUT_CELLPHONE="Enter your cellphone please: ";
    public static final String INPUT_HOMENUMBER="Enter your homenumber please: ";
    public static final String INPUT_EMAIL="Enter your email please: ";
    public static final String INPUT_SKYPE="Enter your skype please: ";

    public static final String INPUT_ZIP="Enter your zipcode please: ";
    public static final String INPUT_CITY="Enter your city please: ";
    public static final String INPUT_STREET="Enter your street please: ";
    public static final String INPUT_HOUSE="Enter your house please: ";
    public static final String INPUT_FLAT="Enter your flat please: ";
    public static final String INPUT_COMMENTS ="Leave your comments or skip this step by pressing enter!";
    public static final String OUTPUT_DATA="You entered the following data: ";


    /**
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void concatenationAndPrint(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
        }


    public String toString(Model m) {
        return m.toString();
    }
}
