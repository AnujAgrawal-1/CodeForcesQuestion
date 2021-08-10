package difficulty1700;

import java.util.Scanner;

public class DominoEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int r= sc.nextInt();
            checkDomino(n,m,r);
        }
    }

    private static void checkDomino(int n, int m, int r) {
        if((n & 1) ==0 && (m & 1) ==0){
            if((r& 1)==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        if((n & 1) ==1 && (m & 1) ==0){
            if(r>=m/2)
            {
                r=r-m/2;
                if(r%2==0){
                    System.out.println("Yes");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("no");
            }
        }
        if((n & 1) ==0 && (m & 1) ==1){
            if(r<=((n*m)/2-n/2)){
                if(r%2==0){
                    System.out.println("yes");
                }
                else
                    System.out.println("no");

            }else
                System.out.println("no");

        }




        }
}

