package ex1;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");

        System.out.println(Student.getSerialNum());
        System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);

        // 클래스 이름으로 직접 호출
        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");

        System.out.println(Student.getSerialNum());
        System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);

    }
}
