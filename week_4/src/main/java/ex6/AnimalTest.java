package ex6;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    private void testDownCasting(ArrayList<Animal> animalList) {
        for(int i = 0 ; i <animalList.size(); i++) {
            Animal animal = animalList.get(i);

            //해당 인스턴스가 맞는지 확인
            if(animal instanceof Human ) {
                //다운캐스팅 실행
                Human human = (Human)animal;
                human.readBook();
            } else if (animal instanceof Tiger ) {
                Tiger tiger = (Tiger)animal;
                tiger.hunt();
            } else if (animal instanceof Eagle ) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else {
                System.out.println("error");
            }
        }
    }
}

