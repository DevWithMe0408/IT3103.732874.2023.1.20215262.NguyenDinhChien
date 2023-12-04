package lap_01;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println(" What's your name ?");
        var strName = input.nextLine();
        System.out.println("How old are you ?");
        var age = input.nextInt();
        System.out.println("How tall are you (m) ?");
        var height = input.nextDouble();

        System.out.println("Mrs/Ms. " + strName + ", " + age + " years old." + " Your height is " + height + ".");

    }
}