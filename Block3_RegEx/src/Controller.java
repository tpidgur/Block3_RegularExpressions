import java.util.Scanner;

/**
 * Class controller can send commands to the model to update the model's state.
 * It can also send commands to its associated view to change the view's presentation of the model
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 13.05.16)
 */
public class Controller {
    private static String NAME_REG = "^[A-Z][a-zA-Z'-]{0,20}$";
    private static String NICK_REG = "^\\w{5,20}$";
    private static String COMMENT_REG = "^\\W\\w{0,200}$";//any word and non-word characters at least 0, but no more than 200 times
    private static String TELEPHONE_NUMBER_REG = "^[+*\\d-]{5,20}$";
    private static String EMAIL_REG = "^\\w+([\\.\\w]+)*@\\w((\\.\\w)*\\w+)*\\.\\w{2,3}$";
    String SKYPE_REG = "^[\\w\\.\\-_]{6,20}$";


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

    private void sendDataToModel(Scanner sc) {
        model.setLastName(inputDataWithScanner(sc, View.INPUT_LAST_NAME, NAME_REG, false));
        model.setFirstName(inputDataWithScanner(sc, View.INPUT_FIRST_NAME, NAME_REG, false));
        model.setMiddleName(inputDataWithScanner(sc, View.INPUT_MIDDLE_NAME, NAME_REG, false));
        model.setNickName(inputDataWithScanner(sc, View.INPUT_NICKNAME, NICK_REG, false));
        model.setCellPhone(inputDataWithScanner(sc, View.INPUT_CELLPHONE, TELEPHONE_NUMBER_REG, false));
        model.setHomeNumber(inputDataWithScanner(sc, View.INPUT_HOMENUMBER, TELEPHONE_NUMBER_REG, false));
        model.seteMail(inputDataWithScanner(sc, View.INPUT_EMAIL, EMAIL_REG, false));
        model.setSkype(inputDataWithScanner(sc, View.INPUT_SKYPE, SKYPE_REG, false));
    }


}
