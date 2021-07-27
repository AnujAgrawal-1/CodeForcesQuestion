import java.util.Scanner;
public class FriendsAndCandies{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int arr[] = new int[n];
            long sum=0;
            for(int i = 0;i<n;i++){
                arr[i]=sc.nextInt();
                sum +=arr[i];
            }
            int k=0;
            if(sum%n==0) {
                long min_candies = sum / n;
                for (int i = 0; i < n; i++) {
                    if (arr[i] > min_candies) {
                        k++;
                    }
                }
            }
            else k=-1;
            System.out.println(k);

        }
    }
}