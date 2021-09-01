package ex1;

public class Student {
    public String studentName;
    public static int studentID;
    static int serialNum = 1000;

    public static int countNum(){
        serialNum++;
        studentID = serialNum;
        return studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return countNum();
    }

}
