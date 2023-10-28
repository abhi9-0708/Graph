import java.util.*;
public class TopologicalSort {
    public static void topSort(ArrayList <Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(vis[i]!=true){
                topSortUtil(graph,i,s,vis);
            }
        } 
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void topSortUtil(ArrayList<Edge>graph[],int curr,Stack s,boolean vis[]){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]!=true){
                topSortUtil(graph,e.dest,s,vis);
            }
        }
        s.push(curr);
    }
    public static void main(String args[]){
        int V=6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,1,1));
        graph[4].add(new Edge(4,1,1));
        graph[4].add(new Edge(4,0,1));
        graph[5].add(new Edge(5,2,1));
        graph[5].add(new Edge(5,0,1));
        topSort(graph);        
    }  
}
class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
}