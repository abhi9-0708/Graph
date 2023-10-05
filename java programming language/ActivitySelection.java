//import java.util.Arrays;
import java .util.*;
public class ActivitySelection {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};//this array is sorted acc to end time

        //code to sort a 2d array
        int activities[][]=new int [start.length][3];//startlength is 6 ie from 0 to 5;
        //column length is taken as 3 to store index,start and end time track;
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lamda function
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        //initializing max activity with 0 first
        int maxAct=0;
        //taking an empty arraylist to keep track of maxactivity
        ArrayList<Integer>ans=new ArrayList<>();
        maxAct=1;
        ans.add(activities[0][0]);//adding the smallest activity to ArrayList
        int lastEnd=(activities[0][2]);//to keep the track of end activity

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //then we have to select the activity
                maxAct+=1;
                ans.add(activities[i][0]);//[i][0]=index
                lastEnd=activities[i][2];//[i][2]=end time
            }
        }
        System.out.println("maximum no of activities possible="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }

    }
    
}
