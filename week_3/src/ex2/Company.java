package ex2;

public class Company {

     /**
     *  고전 싱글톤 구현방법
     **/
//    private static Company company = new Company();
//
//    //기본생성자 생성 불가능(private 선언)
//    private Company(){}
//
//    //getInstance메소드를 통해 한번만 생성된 객체 가져옴
//    public static Company getInstance(){
//        if(company == null){ //최초 한번만 new연산를을 통해 메모리 할당
//            company = new Company();
//        }
//        return company;
//    }


     /**
     *  synchronized를 이용
     **/
//    private static Company company = new Company();
//    private Company(){}

//    //synchronized 사용
//    public synchronized static Company getInstance(){
//        if(company == null){
//            company = new Company();
//        }
//        return company;
//    }

     /**
     *   DCL (Double-checked-Locking) 패턴
     **/

//     private volatile static Company company;
//     private Company(){}
//
//     public static Company getInstance() {
//         if(company == null) {
//             //인스턴스를 생성하는 부분만 synchronized 처리
//             synchronized (Company.class) {
//                 if(company == null) {
//                     company = new Company();
//                 }
//             }
//         }
//        return company;
//    }

     /**
     *  LazyHolder Singleton 패턴 -> 가장 많이 사용됨
     **/

    private Company(){};

    private static class InnerCompany {
        //클래스 로딩 시점에서 생성
        private static final Company instance= new Company();
    }

    public static Company getInstance() {
        return InnerCompany.instance;
    }
}
