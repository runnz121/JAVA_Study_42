package ex3;

public class Card {

    //누적발급 계산
    private static int serialNum = 10000;

    //누적발급번호 출력
    private int cardNum;

    public Card() {
        serialNum++;
        cardNum=serialNum;
    }

    public int getCardNumber() {
        return cardNum;
    }

//    public void setCardNum(int cardNum) {
//        this.cardNum = cardNum;
//    }
}
