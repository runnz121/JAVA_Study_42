package ex1;

public class Calculator implements Calc{


    public int add(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return ERROR;
        else
        return num1/num2;
    }
   // int ERROR = -10000000;
}
