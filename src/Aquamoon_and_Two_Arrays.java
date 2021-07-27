import java.util.Scanner;

public class Aquamoon_and_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();
            int sum=0;
            int operation=0;
            for (int i = 0; i < n; i++) {
                int diff=a[i]-b[i];
                if(diff>0)
                    operation+=diff;
                sum+=diff;
            }
            if(sum!=0){
                System.out.println(-1);
            }
            else{
                System.out.println(operation);


            }


        }
    }
}

