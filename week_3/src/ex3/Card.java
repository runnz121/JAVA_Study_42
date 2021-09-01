package ex3;

public class Card {

    //메모리상에 계속 유지 static 선언
    private static int serialNum = 10000;
    private int cardNum;

    public Card() {
        serialNum++;
        cardNum=serialNum;
    }

    public int getCardNumber() {
        return cardNum;
    }
}
