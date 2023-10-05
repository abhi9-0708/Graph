public class kadane {
    public static void kadane_algo(int array[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currentsum+=array[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        System.out.println("maximum sum is: "+maxsum);
        
    }
    public static void main(String args[]){
        int array[]={2,-3,4,-1,-2,1,5,-3};
        kadane_algo(array);
    }
    
}
