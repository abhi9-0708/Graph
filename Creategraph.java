import java.util.*;
//ok
class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int s, int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
}
public class Creategraph{

    public static void main(String args[]){
        int v=5;
        //int array[]=new int[5];
        ArrayList<Edge> graph[]=new ArrayList[v];//Array of arraylist which store edges;
        //creating empty arraylist at each null index
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        //storing edges for 0 vertex;
        graph[0].add(new Edge(0,1,5));
        //storing edges for 1 vertex;
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        //storing edges for 2 vertex;
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        //storing edges for 3 vertex;
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        //storing edges for 4 vertex;
        graph[4].add(new Edge(4,2,2));

        //finding 2s neighbour
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
