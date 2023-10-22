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
public class DFS_BFS{
    //O(V+E)
    public static void bfs(ArrayList<Edge>graph[]){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);//root element
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    //q.add(new graph[curr].get(i));
                    //error bcz queue can store only int datatype
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
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

        //finding 2s neighbour
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }
        bfs(graph);
        boolean vis[]=new boolean [graph.length];
        dfs(graph,0,vis);
    }
}
