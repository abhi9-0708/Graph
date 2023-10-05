import java.util.*;
public class Fractionalknapsack {
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        
        double array[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            array[i][0]=i;
            array[i][1]=((double)val[i]/weight[i]);
        }
        //sorting ratio in ascending order;
        Arrays.sort(array,Comparator.comparingDouble (o->o[1]));
        //ArrayList<Double>ans=new ArrayList<>();
        int capacity=w;
        int value=0;
        //traversing array in reverse order bcz array is sorted ascending we want max first
        for(int i=val.length-1;i>=0;i--){
            //initializing index so that we can get actual value from val nd weight array;
            int index=(int)array[i][0];
            //adding full item;
            if(capacity>weight[index]){
                capacity=capacity-weight[index];
                value=value+val[index];
            }
            //adding fractional item;
            else{
                value+=array[i][1]*capacity;
                break;

            }
        }
        System.out.print("max value is:"+value);
    }
    
}
