import java.util.Arrays;
import java.util.Scanner;

public class _2Wonderful_coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int count=0;
            int maxBoxThatCanBePainted = n / k;
            int color[] = new int[n];
            for (int i = 1; i <= k; i++) {
                for (int l = 0; l < n; l++) {
                    if(count>maxBoxThatCanBePainted)
                        break;
                    else {

                    }
                }
                System.out.println();

            }
        }
    }
}
