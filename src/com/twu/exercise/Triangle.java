package com.twu.exercise;

public class Triangle {
    public static void printOneAsterisk() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        String s = new String();
        for (int i = 0; i < n; ++i) {
            s += "*";
        }
        System.out.println(s);
    }

    public static void drawVerticalLine(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print one asterisk:");
        Triangle.printOneAsterisk();

        System.out.println("Print horizontal line:");
        Triangle.drawHorizontalLine(8);

        System.out.println("Print vertical line:");
        Triangle.drawVerticalLine(3);

        System.out.println("Print right triangle");
        Triangle.drawRightTriangle(3);
    }

}
