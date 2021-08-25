package ex4;

public class CoffeeBean {

    private String coffeeName;
    private int price;
    private String cumName;

    public CoffeeBean(String coffeeName){
        this.coffeeName = coffeeName;
    }

    public void takeCoffee(int price, String cumName){
        this.price = price;
        this.cumName = cumName;
    }


    public void showCoffeeInfo() {
        System.out.println(cumName + "는 커피빈에가서 " + coffeeName + "을 사고 " + price + "원을 지불했다");
    }
}


