import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int max=0;
            while (n>0){
                int i= n%10;
                if(i>max)
                    max=i;
                n=n/10;

            }
            System.out.println(max);
        }
    }
}
