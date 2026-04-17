public class highestoccurancestring {

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
        int maxCount = 0;

        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                if(current == str.charAt(j)){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
            }
        }

        return maxCount;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
