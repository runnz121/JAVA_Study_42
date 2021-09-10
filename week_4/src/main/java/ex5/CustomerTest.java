package ex5;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        Customer cus1 = new Customer(1001,"이순신");
        Customer cus2 = new Customer(1002,"신사임당");
        Customer cus3 = new GoldCustomer(1003,"홍길동");
        Customer cus4 = new GoldCustomer(1004,"이율곡");
        Customer cus5 = new VIPCustomer(1005,"김유신");

        System.out.println("==================고객 정보 출력====================");

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(cus1);
        customerList.add(cus2);
        customerList.add(cus3);
        customerList.add(cus4);
        customerList.add(cus5);

        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }


        System.out.println("=============할인율과 보너스 포인트 계산===============");

        for(Customer customer : customerList) {
            System.out.println(customer.showPriceInfo());
        }

    }
}
