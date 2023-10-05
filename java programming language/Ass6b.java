public class Ass6b {
    public static void main(String args[]){
        int sum=0;
        for(int i=0;i<args.length;i++){
            
            sum+=Integer.parseInt(args[i]);

        }
        if(args.length==1){
            System.out.println("add require 2 number");
        }
        else if(args.length==0){
            System.out.println("NO number to add");
        }
        else{
            System.out.println(sum);

        }
        
    }
    
}
