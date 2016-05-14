import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Class controller can send commands to the model to update the model's state.
 * It can also send commands to its associated view to change the view's presentation of the model
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 13.05.16)
 */
public class Controller {
    /**
     * # ^                  - Match the line start
     * # [A-Z]              - That starts with 1 letter from A to Z
     * # [a-zA-Z'-]{0,20}   - That starts with 0 to 20 letters in ignoreCase, apostrophe or dash
     * # $                  - Match the end of the line
     * For example:           Mariya-Antuanetta
     */
    private static String NAME_REG = "^[A-Z][a-zA-Z'-]{0,20}$";

    /**
     * # \\w{5,20}          - Matches any 5 to 20  elements from [A-Za-z0-9_]
     * For example:           teti89
     */
    private static String NICK_REG = "^\\w{5,20}$";

    /**
     * # [0-4]              - Matches any number in a range from 0 to 4
     * For example:           0
     */
    private static String GROUP_REG = "^[0-4]$";

    /**
     * # [+\\d-]{5,20}      - Matches any from 5 to 20 digits [0-9], symbol "+" or dash
     * For example:           +38044-234-12-66, 23412
     */
    private static String TELEPHONE_NUMBER_REG = "^[+\\d-]{5,20}$";

    /**
     * # \\w+               - Matches any  word character from [A-Za-z0-9_] 1 or more times
     * # [\\.\\w]*          - Matches dot and \\w 0 or more times
     * # @                  - Matches @
     * # \\w                - Matches \\w 1 time
     * # ((\\.\\w)*\\w+)*   - The inner capturing group (\\.\\w)* can be repeated or not and consists of  dot and \\w.
     * Plus \\w that can be repeated 1 or more times conclude the outer capturing group,
     * that can be repeated 0 or more times
     * # \\.                - Matches dot 1 time
     * # \\w{2,3}           - Matches \\w between 2 and 3 times
     * For example:           pidhur_t.v.@its.kpi.ua, lileya15@gmail.com
     */
    private static String EMAIL_REG = "^\\w+([\\.\\w]+)*@\\w((\\.\\w)*\\w+)*\\.\\w{2,3}$";

    /**
     * # [\\w\.\\-]{6,20}   - Matches any  word character from [A-Za-z0-9_], dot or dash  between 6 and 20 times
     * For example:         in_content, kate-lurry
     */
    private static String SKYPE_REG = "^[\\w\\.\\-]{6,20}$";

    /**
     * # \\d{5}             - Matches any 5  digits [0-9]
     * For example:         03022
     */
    private static String ZIP_REG = "^\\d{5}$";

    /**
     * # (?:                - Start a non-catching group
     * # [a-zA-Z]+          - That starts with 1 or more letters.
     * # [.'\-,]?           - Followed by one period, apostrophe, dash, or comma. (optional)
     * # \s?                - Followed by a space (optional)
     * # )+                 - End of the group, match at least one or more of the previous group.
     * For example:           Coeur d'Alene,  St. Thomas-Vincent
     */
    private static String CITY_REGEX = "^(?:[a-zA-Z]+(?:[.'\\-,])?\\s?)+$";
    private static String STREET_REGEX = "^[A-Z]*[\\w \\-']{2,20}$";   //For example: 40-Letiya Oktjabrja, Flora
    private static String HOUSE_REGEX = "^\\d[\\w\\-]{0,5}$";               //For example: 15, 100-k
    private static String FLAT_REGEX = "^\\d{1,4}-?\\d{0,3}[a-zA-Z]?$";     //For example: 15, 100-k
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("mm/DD/yyyy");
    private static String COMMENT_REG = "^[\\W\\w]{0,200}$"; // any word and non-word characters at least 0, but no more than 200 times

    /**
     * The {@code Model} and  {@code View} represent the instances of the mentioned classes
     * in order to involve model and view objects in Controller class
     */
    Model model;
    View view;

    /**
     * Constructs a new {@code Controller} through initialization of  instances of Model2 and View classes
     *
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method

    /**
     * The method sends commands after the correct value has been entered by user.
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        sendDataToModel(sc);
        view.printMessage(view.OUTPUT_DATA + view.toString(model));
    }

    /**
     * checks for validity of the entered in console data
     *
     * @param sc           - parses string data
     * @param notification -text message instructing the user what kind of data should be entered
     * @param regex        - the string is checked whether matcher the RegEx
     * @param flag         - if true means that the field is optional and can be ommitted by pressing enter
     * @return
     */
    // The Utility methods
    private String inputDataWithScanner(Scanner sc, String notification, String regex, boolean flag) {
        String input;
        view.printMessage(notification);
        while (true) {
            input = sc.nextLine();
            if (flag && input.isEmpty()) {
                input = view.EMPTY_INPUT_DATA;
                break;
            } else if (!input.matches(regex)) {
                view.printMessage(view.WRONG_INPUT);
            } else {
                break;
            }
        }
        return input;
    }

    /**
     * the model fields are filled with data
     * @param sc
     */
    private void sendDataToModel(Scanner sc) {
        model.setLastName(inputDataWithScanner(sc, View.INPUT_LAST_NAME, NAME_REG, false));
        model.setFirstName(inputDataWithScanner(sc, View.INPUT_FIRST_NAME, NAME_REG, false));
        model.setMiddleName(inputDataWithScanner(sc, View.INPUT_MIDDLE_NAME, NAME_REG, false));
        model.setNickName(inputDataWithScanner(sc, View.INPUT_NICKNAME, NICK_REG, false));
        model.setGroup(Integer.valueOf(inputDataWithScanner(sc, View.INPUT_GROUP, GROUP_REG, false)));
        model.setCellPhone(inputDataWithScanner(sc, View.INPUT_CELLPHONE, TELEPHONE_NUMBER_REG, false));
        model.setHomeNumber(inputDataWithScanner(sc, View.INPUT_HOMENUMBER, TELEPHONE_NUMBER_REG, true));//homeNumber is optional
        model.seteMail(inputDataWithScanner(sc, View.INPUT_EMAIL, EMAIL_REG, false));
        model.setSkype(inputDataWithScanner(sc, View.INPUT_SKYPE, SKYPE_REG, true));//skype is optional
        model.setFormattedFullAdress(inputDataWithScanner(sc, View.INPUT_ZIP, ZIP_REG, false),
                inputDataWithScanner(sc, View.INPUT_CITY, CITY_REGEX, false),
                inputDataWithScanner(sc, View.INPUT_STREET, STREET_REGEX, false),
                inputDataWithScanner(sc, View.INPUT_HOUSE, HOUSE_REGEX, false),
                inputDataWithScanner(sc, View.INPUT_FLAT, FLAT_REGEX, false));
        model.setRegistrationDate(getCurrentDate(DATE_FORMAT));
        model.setComments(inputDataWithScanner(sc, View.INPUT_COMMENTS, COMMENT_REG, true));//comments are optional
    }

    /**
     *
     * @param dateFormat the field used to form the corresponding format of the date
     * @return the current date
     */
    private String getCurrentDate(SimpleDateFormat dateFormat) {
        return dateFormat.format(new Date()).toString();
    }
}
