package difficulty800;

import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int count=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
