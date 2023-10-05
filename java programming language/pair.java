
public class pair {
    public static void get_pair(int array[]){
        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.println(array[i]+","+array[j]);
            }
        }
    }
    public static void main(String args[]){

        int array[]={3,7,9,11,15,4,9};
        get_pair(array);


    }
    
}
