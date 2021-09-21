package ex1;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("스스로 멈춥니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지합니다.");
    }

//    @Override
//    public void run() {
//        System.out.println("시동을 켭니다.");
//        System.out.println("스스로 멈춥니다.");
//        System.out.println("사람이 핸들을 조작합니다.");
//        System.out.println("브레이크로 정지합니다.");
//        System.out.println("시동을 끕니다.");
//    }
}
