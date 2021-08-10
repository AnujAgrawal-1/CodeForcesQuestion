package difficulty800;
import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(countSetBit(x));

    }
    private static int countSetBit(int n) {
        int count=0;
        while(n>0) {
            count += n & 1;
            n=n>>1;
        }
        return count;
    }
}
