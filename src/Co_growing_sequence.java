import java.util.Arrays;
import java.util.Scanner;

public class Co_growing_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] arr1 = new int[n];
            arr1[0] = 0;
            for (int i = 1; i < n; i++) {
                int t1 = arr[i - 1] ^ arr1[i - 1];
                int add = 0;
                for (int j = 0; j < 31; j++) {
                    if (((1 << j) & t1)!=0) {
                        if (((1 << j) & arr[i])!= 0) {
                            continue;
                        } else {
                            add |= (1 << j);
                        }
                    }
                    arr1[i] = add;
                }
            }
            System.out.println(Arrays.toString(arr1).replace("[","").replace(",","").replace("]",""));
        }
    }
}