package personInfo;
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        Info info = new Info();
        Scanner sc = new Scanner(System.in);
        System.out.println("사람이면 사람을 입력해주세요");
        String human = sc.nextLine();
        if(human.equals("사람")){
            System.out.println("당신의 이름은 무엇입니까?");
            String name = sc.nextLine();
            //sc.nextLine(); //개행문자는 다음 nextline이 읽음으로 nextline을 하나 더 써주어 개행문자 제거
            System.out.println("당신의 나이는 몇살입니까?");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("당신의 성별은 무엇입니까?(남자 or 여자 입력)");
            String gender = sc.nextLine();
            //sc.nextLine();
            System.out.println("당신은 결혼을 했습니까?(기혼 or 미혼 입력)");
            String marriage = sc.nextLine();
//            System.out.println("아이가 있습니까? 있으면 자녀수를 입력해주세요(없으면 0입력)");
//            int kids = sc.nextInt();
//            info.info(name,age,gender,kids,marriage);
//            info.printInfo();
            if(marriage.equals("기혼")){
                System.out.println("아이가 있습니까? 있으면 자녀수를 입력해주세요(없으면 0입력)");
                int kids = sc.nextInt();
                info.Info(name,age,gender,kids,marriage);
                info.printInfo();
            }else{
                info.Info(name,age,gender,0,marriage);
                info.printInfo();
            }
        }else{
            System.out.println("사람이 아니면 정보를 출력할 수 없습니다.");
        }
        sc.close();
    }
}
