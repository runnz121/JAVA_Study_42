package ex4;

public class Subway {
    private int subID;
    private int passNumSub;
    private int incomeSub;

    public Subway(int subID){
        this.subID = subID;
    }

    public void subwayTaken(int incomeSub){
        this.incomeSub += incomeSub;
        passNumSub += 1;
    }

    public void showSubwayInfo() {
        System.out.println(subID + "번 지하철의 승객은 " + passNumSub + "명 이고, 수입은 " + incomeSub + "원 입니다");
    }
}
