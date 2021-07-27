import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubsequencePermutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            String str=s;
            char []s1=str.toCharArray();
            Arrays.sort(s1);



            int k=0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)!=s1[i])
                    k++;

            }
            System.out.println(k);
        }
    }
}
