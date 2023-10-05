import java .util.*;
public class closestpair2 {
    public static void main(){
        int p[][]={{1,2},{3,4},{5,6},{7,8}};
        ArrayList<Point> points=new ArrayList<>();
        for(int i=0;i<p.length;i++){
            points.add(new Point(p[i][0],p[i][1]));
        }
        Collections.sort(points,(obj1,obj2)->(obj1.x-obj2.x));

    }
    
}
class Point{
    int x;
    int y;

    Point(){
        //
    }
    Point(int x1,int y1){
        x=x1;
        y=y1;

    }
    public double distance(Point p1,Point p2){
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }



}