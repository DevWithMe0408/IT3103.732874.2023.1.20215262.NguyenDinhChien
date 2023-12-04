package lap_01;

import javax.swing.*;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String StrNotification = " You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        StrNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,
                "please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        StrNotification += strNum2;

        JOptionPane.showMessageDialog(null, StrNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
