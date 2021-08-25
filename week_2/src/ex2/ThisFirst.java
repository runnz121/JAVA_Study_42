package ex2;

public class ThisFirst {
    private int first;
    private int second;

    public ThisFirst(int first, int second){
        this.first = first;
        this.second = second;
    }

    //반환타입을 ThisFirst 로 설정한 getFirst 메서드에서 this를 반환
    public ThisFirst getFirst() {
        return this;
    }
}
