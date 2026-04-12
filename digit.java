class Calculator{
    public int num;
    
     
    public int sumOfDigit(){
        int sum=0;
        int temp=num;
        
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            
             temp=temp/10;

        }
        return sum;

    }

}
public class digit {
    
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.num=123;
    
        int result=calculator.sumOfDigit();
        System.out.println(result);
        
    }
}
    

