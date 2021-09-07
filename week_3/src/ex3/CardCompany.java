package ex3;
public class CardCompany {

    //하나의 회사에서 발급됨으로 싱글톤으로 유일 인스턴스 반환
    private static CardCompany company = new CardCompany();

    private CardCompany(){}

    public static CardCompany getInstance() {
        if (company == null) {
            company = new CardCompany();
        }
        return company;
    }

    //메소드 호출시 card instance 생성
     public Card createCard(){
        Card card = new Card();
        return card;
    }
}
