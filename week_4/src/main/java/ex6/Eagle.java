package ex6;

public class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다");
    }

    public void flying() {
        System.out.println("독수리가 두날개를 쭉 펴고 멀리 날아갑니다.");
    }
}
