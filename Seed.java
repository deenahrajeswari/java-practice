
public class Seed{
    public static void main(String[] args) {
        int number1=123;
        int number2=738;
        int original=number1;
        int product=1;
        
        while(number1>0){
            int digit=number1%10;
            product=product*digit;
            number1=number1/10;
        }
        int answer=product*original;
        if(number2==answer){
            System.out.println(original+"is the seed of"+number2);

        }else{
            System.out.println(original+"is the not seed of"+number2);
        }
        
    
    }
}

    


    

