package DZ1;

import java.util.Scanner;

public class ex3 {

   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Введите первое число: ");
      double a = iScanner.nextDouble();
      System.out.print("Введите одно из действий + - / *: ");
      char operation = iScanner.next().charAt(0);
      System.out.printf("Введите второе число: ");
      double b = iScanner.nextDouble();
      double result = 0;
      switch (operation) {
         case '+':
            result = a + b;
            break;
         case '-':
            result = a - b;
            break;
         case '/':
            result = a / b;
            break;
         case '*':
            result = a * b;
            break;
         default:
         System.out.println ( "Вы ввели неверный символ. Попробуйте еще раз");
            return;
      }
      System.out.printf("%f %c %f = %f", a, operation, b, result);
   }
}
