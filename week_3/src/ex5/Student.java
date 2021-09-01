package ex5;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private int total = 0;

    //여러개의 값을 list에 넣기위해선 클래스로 arraylist 생성
    //클래스를 arrylist에 담는다
    ArrayList<Subject> subjectsArrayList = new ArrayList<Subject>();

//    ArrayList<String> subNames = new ArrayList<String>();
//    ArrayList<Integer> subScores= new ArrayList<Integer>();

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String subName, int subScore){
        Subject subjects  = new Subject(subName, subScore);
        subjectsArrayList.add(subjects);

//        subNames.add(subName);
//        subScores.add(subScore);
    }

    //enhanced for 문
    public void showStudentInfo(){
        for(Subject subject : subjectsArrayList) {
            total += subject.getSubScore();
            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다\n",studentName, subject.getSubName(), subject.getSubScore());
        }
        System.out.printf("학생 %s의 총점은 %d 입니다\n",studentName, total);
    }
}
