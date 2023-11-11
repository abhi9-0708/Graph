import java.util.*;
public class AllPathssrcdest {
    public static void createGraph(ArrayList<Edge>graph[]) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3,1));
        graph[2].add(new Edge(2,3,2));
        graph[3].add(new Edge(3,1,1));
        graph[4].add(new Edge(4,1,1));
        graph[4].add(new Edge(4,0,1));
        graph[5].add(new Edge(5,0,1));
         graph[5].add(new Edge(5,2,1));

    }
    //understand the function of str here 
    //due to backtrack the value of str become previous one
    public static void allPaths(ArrayList<Edge>graph[],int src,int dest,String str) {
        if(src==dest){
            System.out.println("the path is:"+str+src);
            return;
        }
        str=str+src;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            
            allPaths(graph,e.dest,dest,str);
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        String str=" ";
        
        allPaths(graph,5,1,str);
    }
}
class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int src,int dest,int wt ){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
}