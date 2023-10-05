import java.util.*;
public class ClosestPair {
 
   

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of n:");
        int size=sc.nextInt();
        Point points[]=new Point[size];
        for(int i=0;i<size;i++){
            points[i]= new Point();
            System.out.println("\nEnter the x and y cordinate of point :"+(i+1));
            points[i].setPoint();
        }
        for(Point point:points){
            System.out.println(point.x+","+point.y);
        }
        Point.sort(points,0,size-1);
        for(Point point:points){
            System.out.println(point.x+","+point.y);
        }
        


        // int closestdist=closepair(points);
        // System.out.println("Closest distance="+closestdist);
        sc.close();

    }
    
}

class Point{
    int x;
    int y;
    Point(){
        //default constructor
    }
    //parameterized constructor
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    void setPoint(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x coordinate:");
        this.x=sc.nextInt();
        System.out.println("enter the y coordinate:");
        this.y=sc.nextInt();
        //sc.close();
    }
    int getx(){
        return this.x;
    }
    int gety(){
        return this.y;
    }
 
    public double distance(Point p1,Point p2){
        int dx=p2.x-p1.x;
        int dy=p2.y-p1.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static void sort(Point points[],int l,int h){
        if(l>=h){
            return;
        }
        int mid=l+(h-l)/2;
        sort(points,l,mid);
        sort(points,mid+1,h);
        merge(points,l,mid,h);
    }
    public static void merge(Point points[],int l,int mid,int h){
        Point temp[]=new Point[h-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=h){
            for(Point point:points){
                if(points[i].x<=points[j].x){
                    temp[k++]=points[i++];
                }
                else{
                    temp[k++]=points[j++];
                }
            }
        }
        while(i<=mid){
            temp[k++]=points[i++];
        }
        while(j<=h){
            temp[k++]=points[j++];
        }
        for(k=0,i=l;k<temp.length;k++,i++){
            points[i++]=temp[k++];
        }

    }
   
}
