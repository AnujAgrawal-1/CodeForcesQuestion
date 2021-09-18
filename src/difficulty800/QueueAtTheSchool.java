package difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int t= sc.nextInt();
        sc.nextLine();
        String cha1=sc.nextLine();
        char [] cha=cha1.toCharArray();
        while(t-->0) {
            for (int i = 0; i < n-1; i++) {
                if ((cha[i]=='B') && (cha[i + 1]=='G')) {
                    char temp = cha[i];
                    cha[i] = cha[i + 1];
                    cha[i + 1] = temp;
                    i++;
                }

            }
        }
        System.out.println(new String(cha));
    }
}
