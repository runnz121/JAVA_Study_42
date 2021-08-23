package arithmeticOperation;

public class ArithmeticOperation {
   private double left;
   private double right;
   private String oper;
   private double res;


   // 1)은닉화 getter, setter로 접근

   //사용자가 메소드 호출시 삽입된 데이터 값 return
   public double getLeft(){
        return left;
   }
   //사용자가 메소드 호출시 데이터 삽입
   public void setLeft(double left){
        this.left = left;
   }
   public double getRight(){
       return right;
   }
   public void setRight(double right){
       this.right = right;
   }
   public String getOper() {
       return oper;
   }
   public void setOper(String oper){
       this.oper = oper;
   }

   public void result(){
       if(oper.equals("+")){
           res = left + right;
           System.out.printf("%.5f",res);
       }else if(oper.equals("-")){
           res = left - right;
           System.out.printf("%.5f",res);
       }else if(oper.equals("*")){
           res = left * right;
           System.out.printf("%.5f",res);
       }else if(oper.equals("/")){
           try{
               res = left/right;
               System.out.printf("%.5f",res);
           }catch(ArithmeticException e){
               //정수일때 에러처리
               //소수점을 위해 double로 처리하면 자연스럽게 에러해결
               System.out.println("cannot divide 0");
           }
       }
   }

}
