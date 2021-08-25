package ex4;

public class Bus {
    private int busID;
    private int passNumBus;
    private int incomeBus;

    public Bus(int busID){
        this.busID = busID;
    }

    public void busTaken(int incomeBus){
        this.incomeBus += incomeBus;
        passNumBus += 1;
    }

    public void showBusInfo(){
        System.out.println(busID + "번 버스의 승객은 " + passNumBus + "명 이고, 수입은 " + incomeBus + "원 입니다" );
    }

}
