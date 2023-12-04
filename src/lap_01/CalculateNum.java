package lap_01;

import javax.swing.*;

public class CalculateNum {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        double sum, diff, prod, quot;


        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,
                "please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        quot = num1 / num2;

        String message = "Sum = " + sum + "\nDiff = " + diff + "\nProd = " + prod + "\nQuot = " + quot;

        if (num2 != 0) {
            JOptionPane.showMessageDialog(null,
                    message, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Yêu cầu num2 khác 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}