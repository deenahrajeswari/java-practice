/*public class reverse{
     public static void main(String args[]){
          int number=123;
          int reverse=0;
           for(int i=0;number>0;i++){

               int digit=(number%10);
               reverse=(reverse*10)+digit;
               number=number/10;
           }
           System.out.print(reverse);
        
     }
}*/
/*public class reverse{
     public static void main(String args[]){
          int number=123;
          int reverse=0;

          while(number>0){
                
               int digit=(number%10);
               reverse=(reverse*10)+digit;
               number=number/10;
         }
         System.out.print(reverse);
     }
}*/

public class reverse{
     public static void main(String args[]){
          int number=123;
          int reverse=0;

          do{
                
               int digit=(number%10);
               reverse=(reverse*10)+digit;
               number=number/10;
         }while(number>0);
         System.out.print(reverse);
     }
}
