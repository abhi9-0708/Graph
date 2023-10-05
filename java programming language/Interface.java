public class Interface {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();

    }
    
}
interface ChessPlyer{
    void moves();//by default public,abstract,without implementation

}  
class Queen{
    //as mentioned above in interface class move is public so here in queen class also moves should be public
    public void moves(){
        System.out.println("up, down,left ,right ,diagonal");
    }
}
class Rook{
    public void moves(){
        System.out.println("up, down,left ,right ");
    }
}
class King{
    public void moves(){
        System.out.println("up, down,left ,right ,diagonal(by 1 step):");
    }
}