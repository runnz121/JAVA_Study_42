package ex5;

public class VIPCustomer extends Customer {

    public VIPCustomer(int customID, String customName){
        super(customID, customName);
        customGrade ="VIP";
        addPoint = 0.05;
        discountRatio = 0.1;
    }

    @Override
    public String showCustomerInfo(){
        return customName+"님의 등급은 " + customGrade +"이며, 보너스 포인트는 " + bonusPoint +"입니다. 담당 상담원 번호는 12345입니다";
    }

}
