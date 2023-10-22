import java.util.*;
class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;

    }
}
public class isCycle {
    public static void print(int matrix[][]){
        for(int i = 0; i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void adjacencyMatrix(ArrayList<Edge>graph[]){
        int matrix[][]=new int[graph.length][graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                if(e.wt!=0){
                    matrix[i][j]=e.wt;
                }
            }

        }
    print(matrix);
    }

    public static boolean isCYcle(ArrayList <Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean isCycleUtil(ArrayList<Edge>graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //here we do not need to check for parent bcz it is directed graph;
            if(stack[e.dest]==true){
                return true;
            
            }
            else if(!vis[e.dest]){
                if(isCycleUtil(graph,e.dest,vis,stack)){
                    return true;
                }
            }
        }
        stack[curr]=false;
        return false;
    }
    public static void topologicalSort(ArrayList <Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topologicalSortUtil(graph,i,vis,s);
            }
        }
        while(!s.empty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void topologicalSortUtil(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s){
         vis[curr]=true;
         
         for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSortUtil(graph,e.dest,vis,s);
                
            }
         }
         s.add(curr);

    }

    public static void main(String args[]){
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
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

        //  if(isCYcle(graph)){
        //     System.out.println("graph is cyclic");

        //  }else {
        //     System.out.println("Graph is not cyclic");
        //  }
        topologicalSort(graph);
    }
    
}
