package ex3;

public class Customer implements Buy, Sell{

    @Override
    public void sell() {
        System.out.println("sell");
    }

    @Override
    public void buy() {
        System.out.println("buy");
    }


    @Override
    public void order() {
        System.out.println("order");
    }

}
