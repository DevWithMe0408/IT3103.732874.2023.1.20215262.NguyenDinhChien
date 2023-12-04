package lap_01;

import java.util.Scanner;

public class DaysOfMonth {

    public static void main(String[] args) {

        //Input
        var input = new Scanner(System.in);

        int inputDay = 0;
        int input_month = 0;
        String inputMonth = "Unknown";

        System.out.println("Month: ");
        String month = input.nextLine();
        //System.out.print(month.equals("1")|| month.equals("jan")|| month.equals(".jan"));

        System.out.println("Year: ");
        int year = input.nextInt();


        //Convert many versions of month inputs into month number

        if (month.equals("1") || month.equals("Jan") || month.equals("Jan.")) input_month = 1;
        else if (month.equals("2") || month.equals("Feb") || month.equals("Feb.")) input_month = 2;
        else if (month.equals("3") || month.equals("Mar") || month.equals("Mar.")) input_month = 3;
        else if (month.equals("4") || month.equals("Apr") || month.equals("Apr.")) input_month = 4;
        else if (month.equals("5") || month.equals("May")) input_month = 5;
        else if (month.equals("6") || month.equals("Jun") || month.equals("June")) input_month = 6;
        else if (month.equals("7") || month.equals("Jul") || month.equals("July")) input_month = 7;
        else if (month.equals("8") || month.equals("Aug") || month.equals("Aug.")) input_month = 8;
        else if (month.equals("9") || month.equals("Sep") || month.equals("Sept.")) input_month = 9;
        else if (month.equals("10") || month.equals("Oct") || month.equals("Oct.")) input_month = 10;
        else if (month.equals("11") || month.equals("Nov") || month.equals("Nov.")) input_month = 11;
        else if (month.equals("12") || month.equals("Dec") || month.equals("Dec.")) input_month = 12;

        // Compare the month number + the year & find the appropriate days in month
        switch (input_month) {
            case 1:
                inputMonth = "January";
                inputDay = 31;
                break;
            case 2:
                inputMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    inputDay = 29;
                } else {
                    inputDay = 28;
                }
                break;
            case 3:
                inputMonth = "March";
                inputDay = 31;
                break;
            case 4:
                inputMonth = "April";
                inputDay = 30;
                break;
            case 5:
                inputMonth = "May";
                inputDay = 31;
                break;
            case 6:
                inputMonth = "June";
                inputDay = 30;
                break;
            case 7:
                inputMonth = "July";
                inputDay = 31;
                break;
            case 8:
                inputMonth = "August";
                inputDay = 31;
                break;
            case 9:
                inputMonth = "September";
                inputDay = 30;
                break;
            case 10:
                inputMonth = "October";
                inputDay = 31;
                break;
            case 11:
                inputMonth = "November";
                inputDay = 30;
                break;
            case 12:
                inputMonth = "December";
                inputDay = 31;
        }

        //Output
        System.out.println(inputMonth + " " + year + " has " + inputDay + " days\n");
    }
}