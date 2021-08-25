package ex3;

public class Student {

    int studentID;
    String studentName;

    //변수를 타입을 클래스 네임으로 선언
    Subject korea;
    Subject math;

    public Student(int id, String name) {
        this.studentID = id;
        this.studentName = name;

        this.korea = new Subject();
        this.math = new Subject();
    }


    public void setKorean(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMath(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentInfo() {
        int total = korea.score + math.score;
        System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );
    }
}
