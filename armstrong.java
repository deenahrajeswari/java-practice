public class armstrong {
    public static void main(String[] args) {
        int number=1634;
         int original=number;
         
         int digits=String.valueOf(number).length();
         
         int sum=0;

         while(number>0){
            int digit=number%10;
            sum+=(int)Math.pow(digit, digits);
            number=number/10;

         }
         System.out.println(sum);
         if(original==sum){
            System.out.println(original+"is an armstrong number");
         }
         else{
            System.out.println(original+"is not an armstrong number");
         }
    }
}
