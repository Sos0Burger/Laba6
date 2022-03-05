package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите x");
        int x = in.nextInt();

        System.out.println("Введите y");
        int y = in.nextInt();

        coordinates equation = new coordinates(x,y);
        equation.solvation();
    }

}
class coordinates {
    private int x;
    private int y;
    private double z;

    coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void solvation() {
        if (y + 1 == 0) {
            System.out.println("Делить на ноль нельзя");
        } else {
            z = (x + y) / (y + 1);
            System.out.println("Ответ: "+ z);
        }
    }
}