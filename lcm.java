public class lcm {
    public static void main(String[] args) {
        int num1=7;
        int num2=9;
        

        /*int ans=(num1>num2)?num1:num2;*/
        int ans;
        if(num1>num2){
            ans=num1;
        }
        else{
            ans=num2;
        }


        while(true){
           if(ans%num1==0 && ans%num2==0){
                    break;
            
                 
        }
        ans++;
        }
        System.out.print(ans);
        
    }
    
}
