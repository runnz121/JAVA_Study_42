package ex4;

//https://techblog.woowahan.com/2502/
//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=zzang9ha&logNo=221769329359
public class Student {

    private String name;
    private int grade;
    private int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.busTaken(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.subwayTaken(1200);
        this.money -= 1200;
    }

    public void goStarBucks(StarBucks starBucks){
        starBucks.takeCoffee(3000, this.name);
    }

    public void goCoffeeBean(CoffeeBean coffeeBean){
        coffeeBean.takeCoffee(4000, this.name);
    }



    public void showInfo(){
        System.out.println(name +"님의 남은 돈은 " + money + "원 입니다");
    }
}
