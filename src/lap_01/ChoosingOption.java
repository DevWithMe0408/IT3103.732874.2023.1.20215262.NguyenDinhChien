package lap_01;

import javax.swing.JOptionPane;

//6.1	Write, compile and run the ChoosingOption program
public class ChoosingOption {
    //1. If users choose “Cancel”
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");

        JOptionPane.showConfirmDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION? "Yes":"No"));
        System.exit(0);
        /*
         *  If users choose Cancel,
         *  the program will automatically show that you've chosen no
         */
    }
    //2.
    //a. Customize the options to users, e.g. only two options: “Yes” and “No”
    public static void customize1(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?", null, JOptionPane.YES_NO_OPTION);

        JOptionPane.showConfirmDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION? "Yes":"No"), null, JOptionPane.YES_NO_OPTION);
        System.exit(0);
    }
    //b. Customize the options to users, e.g. only two options: “I do” and “I don’t”
    public static void customize2(String[] args) {
        Object[] options = {"I do","I don't"};
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?", null,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        JOptionPane.showConfirmDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION? "I do":"I don't"), null, JOptionPane.YES_NO_OPTION);
        System.exit(0);
    }
}
