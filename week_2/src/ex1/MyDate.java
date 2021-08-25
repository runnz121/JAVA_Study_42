package ex1;

public class MyDate {
    private int day;
    private int month;
    private int year;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

   public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
  
    public String isValid(){
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            //System.out.printf("%d년 %d월 %d일은 유효하지 않은 날짜 입니다.", year, month, day);
            return year + "년 " + month + "월 " + day + "일은 유효하지 않은 날짜 입니다.";
        }else{
            return year + "년 " + month + "월 " + day + "일은 유효한 날짜 입니다.";
        }
    }
}