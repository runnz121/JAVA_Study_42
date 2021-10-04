package ex1;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc.add(a,b));
        System.out.println(calc.substract(a,b));
        System.out.println(calc.times(a,b));
        System.out.println(calc.divide(a,b));
    }
}
