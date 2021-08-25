package ex2;

public class ThisThird {
    private int first;
    private int second;

    public void setFirst(int first){
        this.first = first;
    }


    public void setSecond(int second) {
        this.second = second;
    }

    public void printThisThird(){
        System.out.println("첫번째 인자 :" + first);
        System.out.println("두번째 인자 :" + second);
    }
}
