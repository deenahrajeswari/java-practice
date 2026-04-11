class calc{
    
    public double findAverage(int number1,int number2,int number3){
        double average=((number1+number2+number3)/3.0);
        
         double result =Math.round(average*100.0)/100.0;
        
             
        
        
        return result;

    }


}
public class Calculator {
   public static void main(String[] args) {
    calc obj=new calc();
    double avg=obj.findAverage(12, 8, 15);
    System.out.println(avg);
    
    
   }
    
}
/*int number1;
    int number2;
    int number3; */
