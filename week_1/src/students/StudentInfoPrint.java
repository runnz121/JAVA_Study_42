package students;

public class StudentInfoPrint {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(1001,"홍길동" , 2);  //생성자를 통해 초기화
        si.printStudentInfo();//클래스 변수의 내용을 출력
    }
}
