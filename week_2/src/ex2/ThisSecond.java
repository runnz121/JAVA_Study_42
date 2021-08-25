package ex2;

public class ThisSecond {
    private int first;
    private int second;

    public ThisSecond(){
        this(100, 200);
    }

    public ThisSecond(int first, int second){
        this.first = first;
        this.second = second;
    }

    public void printThisSecond(){
        System.out.println("첫번째 인자 :" + first);
        System.out.println("두번째 인자 :" + second + "\n");
    }
}
