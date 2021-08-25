package ex3;

public class StudentTest {
    public static void main(String[] args) {

        //https://velog.io/@ldevlog/09.-%EC%B0%B8%EC%A1%B0-%EC%9E%90%EB%A3%8C%ED%98%95-%EB%B3%80%EC%88%98
        Student studentLee = new Student(1001, "Lee");
        studentLee.setKorean("국어", 100);
        studentLee.setMath("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.setKorean("국어", 70);
        studentKim.setMath("수학", 85);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
