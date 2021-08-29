package difficulty800;

import java.util.Scanner;

public class WayToLong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        int len = n.length();
        String s1=String.valueOf(n.charAt(0));
        System.out.println(s1+(len-2)+n.charAt(len-1));
    }
}
