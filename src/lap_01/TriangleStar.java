package lap_01;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter rows: ");
        var h = input.nextInt();

        // vẽ tam giác cân đặc bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 đến h+i-1
        // các vị trí còn lại vẽ khoảng trắng

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}


