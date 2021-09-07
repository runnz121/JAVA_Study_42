package ex1;

public class Student {
    //테스트케이스에서 직접 변수 호출 함으로 public으로 선언
    public String studentName;
    public static int studentID;

    //공유를 위해 static 변수로 선언
    private static int serialNum = 1000;


    public static int countNum(){
        serialNum++;
        studentID = serialNum;
        return studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //static 메서드를 반환
    public static int getSerialNum() {
        return countNum();
    }
}
