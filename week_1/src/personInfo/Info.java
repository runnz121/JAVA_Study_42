package personInfo;

public class Info {
    private String name;
    private int age;
    private String gender;
    private int kids;
    private String marriage;

     // public Info(){}; //기본생성자
    //오버로딩 : 클래스와 이름이 같은 메소드나 생성자를 만들고 이를 입력받은 매개변수로 알맞게 초기화
    public void Info(String name, int age, String gender, int kids, String marriage) { //메소드를 통해 호출(메소드 오버로딩)
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.kids = kids;
        this.marriage = marriage;
    }

    public void printInfo(){
        gender = (gender.equals("남자")) ? "남성" : "여성";
        System.out.printf("이름은 %s이고 나이는 %d살 입니다.%n",name,age);
        System.out.printf("성별은 %s이며, %s자입니다. 자녀는 %d명이 있습니다." ,gender, marriage, kids);
    }
}

