import java.util.*;
public class UserInput{
    public static void dfs(ArrayList<Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfsUtil(graph,i,vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.println(curr);
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }
   
    public static void input(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<graph.length;i++){
            System.out.println("enter "+(i+1)+" graph element");
            int curr=sc.nextInt();
            System.out.println("enter the no of neighbours of "+curr);
            int neigh=sc.nextInt();
            for(int j=0;j<neigh;j++){
                System.out.println("enter the "+(j+1) +" neighbour of "+ curr);
                int d=sc.nextInt();
                System.out.println("enter the weight");
                int w=sc.nextInt();
                graph[curr].add(new Edge(curr,d,w));
            }
        }
        System.out.println("the graph elements are:");
        dfs(graph);
        sc.close();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total vertices");
        int V=sc.nextInt();
        ArrayList<Edge>graph[]=new ArrayList[V];
        input(graph);
        sc.close();

    }
}
class Edge{
    int src;
    int dest;
    int wt;
    public  Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
}