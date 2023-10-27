import java.util.*;
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
public class Prims{
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;      
        }
        @Override
        public int compareTo(Pair p){
            return this.cost-p.cost;//ascending order
        }
    }
    public static void prims(ArrayList<Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalCost=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalCost+=curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }   
        }
        System.out.println("Minimum Spanning Tree Cost is "+finalCost);
    }

    public static void main(String args[]){
        int V=5;
        //int array[]=new int[5];
        ArrayList<Edge> graph[]=new ArrayList[V];//Array of arraylist which store edges;
        //creating empty arraylist at each null index
        for(int i=0;i<V;i++){
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
        graph[4].add(new Edge(4,1,1));

        prims(graph);

}
}