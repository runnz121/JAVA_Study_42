package ex1;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율 주행 합니다");
        System.out.println("자동차가 스스로 방향을 전환합니다.");

    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }
    //    @Override
//    public void run() {
//        System.out.println("시동을 켭니다");
//        System.out.println("자율 주행 합니다");
//        System.out.println("자동차가 스스로 방향을 전환합니다.");
//        System.out.println("스스로 멈춥니다.");
//        System.out.println("시동을 끕니다.");
//    }
}
