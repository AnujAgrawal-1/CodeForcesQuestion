package difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int []arr = new int[n];
         int sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        int count=0;
        int sum1=0;
        for (int i = n-1; i >=0; i--) {
            sum=sum-arr[i];
            sum1+=arr[i];
            count++;


            if(sum<sum1){
                break;
            }
        }
        System.out.println(count);




    }
}
