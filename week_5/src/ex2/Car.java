package ex2;

public abstract class Car {

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    //hook method
    public void wiper(){
    }

    public void hook(){
    }

    //추상 메서드 오버라이딩 대상
    public abstract void drive();
    public abstract void stop();


    //템플릿 메서드
    public final void run(){
        startCar();
        drive();
        wiper();
        hook();
        stop();
        turnOff();
    }
}
