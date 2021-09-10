package difficulty800;

import java.util.Scanner;

public class WhoOpposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c= sc.nextInt();
            int diff=Math.abs(a-b);
            int size = diff*2;
            if(a>size || b>size || c>size){
                System.out.println(-1);
            }else{
                if(c+diff>size){
                    System.out.println(-1);
                }
                else{
                    System.out.println(c+diff);
                }
            }
        }
    }
}
