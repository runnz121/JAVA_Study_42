package ex4;

public class GoldCustomer extends Customer {

    public GoldCustomer(int customID, String customName){
        super(customID, customName);
        customGrade ="GOLD";
        addPoint = 0.02;
        discountRatio = 0.1;
    }
}
