import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Shortest_path_with_Obstacle{
    public static void main(String args[]){
        class Pairs{
            int x;
            int y;
            Pairs(int x,int y){
                this.x=x;
                this.y=y;
            }
        }
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            ArrayList<Pairs> ls = new ArrayList<>();
            for(int i =0;i<3;i++){
                ls.add(new Pairs(sc.nextInt(),sc.nextInt()));
            }
            int ans = Math.abs(ls.get(0).x-ls.get(1).x)+Math.abs(ls.get(0).y-ls.get(1).y);
            if(ls.get(0).x==ls.get(1).x && ls.get(0).x==ls.get(2).x&& Math.min(ls.get(0).y,ls.get(1).y)<ls.get(2).y&&ls.get(2).y<Math.max(ls.get(0).y,ls.get(1).y)||
                    ls.get(0).y==ls.get(1).y && ls.get(0).y==ls.get(2).y&& Math.min(ls.get(0).x,ls.get(1).x)<ls.get(2).x && ls.get(2).x<Math.max(ls.get(0).x,ls.get(1).x)){
                ans+=2;
            }
            System.out.println(ans);

        }
    }


}