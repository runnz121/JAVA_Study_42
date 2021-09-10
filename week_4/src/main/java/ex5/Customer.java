package ex5;

public class Customer {

    protected int customID;
    protected String customName;
    protected String customGrade;
    protected double addPoint;
    protected double discountRatio;


    public int bonusPoint;


    public Customer(int customID, String customName){
        this.customID = customID;
        this.customName = customName;

        customGrade = "SILVER";
        addPoint = 0.01;
        discountRatio = 0;
    }

    public int calcPrice(int price){

        bonusPoint = bonusPoint + (int)(price*addPoint);
        price = price-(int)(price * discountRatio);

        return price;
    }



    public String showCustomerInfo(){
        return customName+"님의 등급은 " + customGrade +"이며, 보너스 포인트는 " + bonusPoint +"입니다";
    }

    public String showPriceInfo(){
        return customName+" 님이 " + calcPrice(10000)+ "원 지불하셨습니다.\n"+
                customName+" 님의 현재 보너스 포인트는 " + bonusPoint+"점입니다.";
    }
}
