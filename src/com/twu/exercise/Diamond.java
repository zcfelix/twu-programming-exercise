package com.twu.exercise;

public class Diamond {
    public static void drawCenterTriangle(int n) {
        for (int i = 1; i <= n; ++i) {
            drawFromPoint(n - i);
            drawHorizontalLine(2 * i - 1);
        }
    }

    public static void drawCenterTriangleWithoutLastLine(int n) {
        for (int i = 1; i <= n - 1; ++i) {
            drawFromPoint(n - i);
            drawHorizontalLine(2 * i - 1);
        }
    }

    public static void drawInverseCenterTriangleWithoutFirstLine(int n) {
        for (int i = 1; i <= n - 1; ++i) {
            drawFromPoint(i);
            drawHorizontalLine(2 * (n - i - 1) + 1);
        }
    }

    public static void drawCenterDiamond(int n) {
        drawCenterTriangleWithoutLastLine(n);
        drawHorizontalLine(2 * n - 1);
        drawInverseCenterTriangleWithoutFirstLine(n);
    }

    public static void drawCenterDiamondWithName(int n) {
        drawCenterTriangleWithoutLastLine(n);
        System.out.println("Felix");
        drawInverseCenterTriangleWithoutFirstLine(n);
    }

    public static void drawFromPoint(int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(" ");
    }

    public static void drawHorizontalLine(int n) {
        String s = new String();
        for (int i = 0; i < n; ++i) {
            s += "*";
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("Print center triangle:");
        Diamond.drawCenterTriangle(3);

        System.out.println("Print center diamond:");
        Diamond.drawCenterDiamond(3);

        System.out.println("Print center diamond with my name:");
        Diamond.drawCenterDiamondWithName(5);
    }

}
