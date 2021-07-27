import java.util.Arrays;
import java.util.Scanner;

public class Stable_group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int x= sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count=1;
        for (int i = 0; i < n-1; i++) {
            if(Math.abs(arr[i+1]-arr[i])>x) {
                count++;
                System.out.println(count);
            }

        }
        System.out.println(count-k);
    }
}
