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
public class bipartite{
    public static boolean isBipartite(ArrayList<Edge>graph[]){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }
        Queue<Integer>q=new LinkedList<>();
        
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if(col[e.dest]==-1){
                            int nextCol=col[curr]==0?1:0;
                            col[e.dest]=nextCol;
                            q.add(e.dest);
                        }else if(col[curr]==col[e.dest]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
   
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        if(isBipartite(graph)){
            System.out.println("bipartite");

        }else{
            System.out.println("non bipartite");
        }


    }
}