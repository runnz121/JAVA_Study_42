package students;

public class StudentInfo {
    private int studentID; //정보 은닉
    private String name;
    private int grade;

    //public StudentInfo (){} //-> 기본 생성자(클래스 이름과 항상 동일)
    public StudentInfo (int id, String names, int level){ //직접 파라미터를 받는 생성자를 선언
        this.studentID = id;
        this.name = names;
        this.grade = level;
    }

    public void printStudentInfo(){ //출력 매서드
        System.out.println("학번 : " + studentID);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade +"학년");
    }
}
