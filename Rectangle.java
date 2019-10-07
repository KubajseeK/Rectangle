package sk.itsovy.learning;

import java.util.Scanner;

public class Rectangle {

    public void rectangle1() {
        Scanner fullRectangle = new Scanner(System.in);
        System.out.println("Enter values of your rectangle:");
        int row = fullRectangle.nextInt();
        int symbols = fullRectangle.nextInt();

        for (int a = 1; a <= row; a++) {
            System.out.println();
            for (int j = 1; j <= symbols; j++) {
                System.out.print("@");
            }
        }

    }
    public void rectangle2() {
        Scanner hollowRectangle = new Scanner(System.in);

        System.out.println("Enter values of your rectangle:");
        String symbol = hollowRectangle.nextLine();
        int row = hollowRectangle.nextInt();
        int symbols = hollowRectangle.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= symbols; j++) {
                if (i == 1 || i == row ||
                j == 1 || j == symbols)
                    System.out.print(symbol);
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
