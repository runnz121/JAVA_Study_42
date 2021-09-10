package ex2;

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
}
