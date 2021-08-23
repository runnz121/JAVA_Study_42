package arithmeticOperation;

import java.util.Scanner;

public class TestOperation {
    public static void main(String[] args) {
        ArithmeticOperation ao = new ArithmeticOperation();

        //https://st-lab.tistory.com/41
        //system.in : 사용자로부터 입력을 받기 위한 스트림
        Scanner sc = new Scanner(System.in);

        System.out.println("연산할 첫번째 값을 입력하세요");
        ao.setLeft(sc.nextDouble());
        sc.nextLine();
        System.out.println("연산할 사칙연산 기호를 입력하세요 (+,-,*,/ 중 입력)");
        ao.setOper(sc.nextLine());
        System.out.println("연산할 두번째 값을 입력하세요");
        ao.setRight(sc.nextDouble());

        sc.close();

//        ao.setLeft(100);
//        ao.setRight(200);
        System.out.println("입력한 값");
        System.out.printf("첫번째 입력값 : %.5f\n",ao.getLeft());
        System.out.printf("두번째 입력값 : %.5f\n",ao.getRight());
        System.out.printf("연산조건 : %s\n", ao.getOper());
        System.out.println("------결과값------");
        ao.result();
    }
}
