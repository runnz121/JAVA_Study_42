package arithmeticOperation;

public class ArithmeticOperation {
    int left;
    int right;

    public int sum(int num1, int num2){
        this.left = num1;
        this.right = num2;
        return num1 + num2;
    }

    public int minus(int num1, int num2){
        this.left = num1;
        this.right = num2;
        return num1 - num2;
    }

    public int multi(int num1, int num2){
        this.left = num1;
        this.right = num2;
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        this.left = num1;
        this.right = num2;
        return num1/num2;
    }
}
