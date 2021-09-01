package ex2;

public class Company {

    private static Company company = null;

    //기본생성자 생성 불가능(private 선언)
    private Company(){}

    //getInstance메소드를 통해 한번만 생성된 객체 가져옴
    public static Company getInstance(){
        if(company == null){ //최초 한번만 new연산를을 통해 메모리 할당
            company = new Company();
        }
        return company;
    }
}
