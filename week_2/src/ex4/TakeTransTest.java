package ex4;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        StarBucks starBucks = new StarBucks("americano");
        CoffeeBean coffeeBean = new CoffeeBean("latte");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        studentJ.goStarBucks(starBucks);
        studentT.goCoffeeBean(coffeeBean);

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();

        starBucks.showCoffeeInfo();
        coffeeBean.showCoffeeInfo();
    }
}
