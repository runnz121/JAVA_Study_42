package ex1;

public class VIPCustomer extends Customer{

    public VIPCustomer(int customID, String customName){
        super(customID, customName);
        customGrade ="VIP";
        addPoint = 0.05;
        discountRatio = 0.1;
    }
}
