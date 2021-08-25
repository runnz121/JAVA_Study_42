package ex2;

public class ThisKindsTest {
    public static void main(String[] args) {
        //https://peemangit.tistory.com/395

        //1번째
        System.out.println("자기 자신의 인스턴스 주소를 가리키는 this");

        ThisFirst TF = new ThisFirst(100, 200);
        System.out.println(TF);

        ThisFirst TF1 = TF.getFirst();
        System.out.println(TF1+"\n");

        //2번째
        System.out.println("생성자에서 다른 생성자를 호출하는 this");
        ThisSecond TS = new ThisSecond();
        TS.printThisSecond();


        //3번째
        System.out.println("자기 자신을 반환하는 this");
        ThisThird TT = new ThisThird();
        TT.setFirst(100);
        TT.setSecond(200);

        TT.printThisThird();
    }
}
