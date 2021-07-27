import java.util.Scanner;
public class Odd_set{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int odd_count=0;
            int []arr = new int[2*n];
            for(int i= 0;i<n*2;i++){
                arr[i]=sc.nextInt();
                if((arr[i]&1)==1) odd_count++;
            }
                System.out.println(odd_count==n?"Yes":"No");


        }
    }
}