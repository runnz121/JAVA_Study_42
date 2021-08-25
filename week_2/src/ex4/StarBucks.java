package ex4;

public class StarBucks {

   private String coffeeName;
   private int price;
   private String cumName;

   public StarBucks(String coffeeName){
       this.coffeeName = coffeeName;
   }

   public void takeCoffee(int price, String cumName){
       this.price = price;
       this.cumName = cumName;
   }

   public void showCoffeeInfo() {
       System.out.println(cumName + "는 스타벅스에가서 " + coffeeName + "을 사고 " + price + "원을 지불했다");
   }
}
