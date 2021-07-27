import java.util.Scanner;

public class Find_the_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int s = sc.nextInt();
            int count=0;
            int sum=0;int i=1;
            while (sum<s){
                sum+=i;
                i+=2;
                count++;
            }

            System.out.println(count);

        }
    }
}
