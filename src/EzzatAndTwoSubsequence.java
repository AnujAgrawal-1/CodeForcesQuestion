import java.util.Arrays;
import java.util.Scanner;

public class EzzatAndTwoSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            double []arr = new double[n];
            double sum=0;
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                sum+=arr[i];
            }

            Arrays.sort(arr);
            sum=sum-arr[n-1];
            System.out.println(arr[n-1]+(sum/(n-1)));
        }
    }
}
