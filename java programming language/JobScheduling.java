import java.util.*;
public class JobScheduling {
    static class Job{
        int deadline;
        int profit;
        int id;//0->A ,1->B
        Job(){
            //
        }
        //parameterized constructor
        Job(int d,int p,int i){
            id=i;
            deadline=d;
            profit=p;
            
        }
    }

    // public static void main(String args[]){
    //     int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        //important->we can use arraylist in place of array;
    //     Job jobs[]=new Job[jobinfo.length];
    //     for(int i=0;i<jobinfo.length;i++){
    //         jobs[i]=new Job(i,jobinfo[i][0],jobinfo[i][2]);

    //     }
    public static void main(String args[]){
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for (int i=0;i<jobinfo.length;i++){
            //adding Job object to jobs arraylist;
            jobs.add(new Job(jobinfo[i][0],jobinfo[i][1],i));

        }
        //sorting my arraylist by defining lamda functionm
       // Collections.sort(jobs,(a,b)->(a.profit-b.profit));
       Collections.sort(jobs,(obj1,obj2)->(obj2.profit-obj1.profit));//descending order

       
       ArrayList <Integer> ans=new ArrayList<>();//note we need to know only work index;
       int time =0;
       for(int i=0;i<jobs.size();i++){
            Job cur=jobs.get(i);
            if(cur.deadline>time){//cur.deadline>time
                ans.add(cur.id);
                //System.out.println(cur.id);
                time++;

            }
       }
       System.out.println("Maximum size possible is:"+ans.size());
       for(int i=0;i<ans.size();i++){
        System.out.println(ans.get(i));
       }

    }
}
    

