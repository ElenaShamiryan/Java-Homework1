package DZ1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = iScanner.nextInt();
        System.out.println("Последовательность треугольных чисел равна: ");
        int result = triangle(num);
        System.out.println();
        System.out.println("Факториал числа равен: ");
        int result2 = factorial(num);

    }

    private static int triangle(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res = ((i * (i + 1)))/2;
            System.out.print(res + " ");
        }
        return res;
    }

    private static int factorial(int num) {
        int res2 = 1;
        for (int i = 1; i <= num; i++) {            
            res2 = res2 * i;
        }
        System.out.println(res2);
        return res2;
    }

}