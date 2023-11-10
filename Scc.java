import java.util.*;
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
public class Scc{ 
    public static void dfs(ArrayList<Edge>transpose[]) {
        boolean vis[]=new boolean[transpose.length];
        for(int i=0;i<transpose.length;i++){
            if(!vis[i]){
                dfsutil(transpose,i,vis);
            }
        }
    }
    public static void dfsutil(ArrayList<Edge>transpose[],int curr,boolean vis[]) {
        vis[curr]=true;
        System.out.println(curr);
        for(int i=0;i<transpose[curr].size();i++){
            Edge e=transpose[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(transpose,e.dest,vis);
            }   
        }     
    }
    public static void topSortUtil(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s) {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph,e.dest,vis,s);
            }  
        }
        s.add(curr);
    }
    public static void scc(ArrayList<Edge>graph[]) {
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s);
            }
        }
        ArrayList<Edge>transpose[]=new ArrayList[graph.length];
        for(int i=0;i<graph.length;i++){
            transpose[i]= new ArrayList<>();
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src,e.wt));
            }
        }
    
        dfs(transpose);
        System.out.println("task done");
        boolean vis1[]=new boolean[graph.length];
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis1[curr]){
                dfs1(transpose,curr,vis1);
            }
        }
        
    }
    public static void dfs1(ArrayList<Edge>transpose[],int curr,boolean vis1[]) {
        vis1[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<transpose[curr].size();i++){
            Edge e=transpose[curr].get(i);
            if(!vis1[e.dest]){
                dfs1(transpose,e.dest,vis1);
            }
        }       
        System.out.println();
    }
    public static void createGraph(ArrayList<Edge>graph[],int V) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));
        graph[1].add(new Edge(1,0,1));
        graph[2].add(new Edge(2,1,1));
        graph[3].add(new Edge(3,4,1));
        
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[5];
        createGraph(graph,V);
        scc(graph);    
    }
}