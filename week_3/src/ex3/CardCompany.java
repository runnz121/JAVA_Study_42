package ex3;
public class CardCompany {

    private static CardCompany company = null;
    private CardCompany(){}

    public static CardCompany getInstance() {
        if (company == null) {
            company = new CardCompany();
        }
        return company;
    }

    //참조변수 card로 반환
    //instance없이 사용하기 위해 static 붙임
    public static Card createCard(){
        Card card = new Card();
        return card;
    }
}
