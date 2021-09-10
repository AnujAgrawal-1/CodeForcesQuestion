package difficulty800;

import java.util.Scanner;

public class WordCaptalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char ch=s.charAt(0);
        if(s.length()>1) {
            ch = ch > 97 ? (char) (ch - 32) : ch;
            System.out.println(ch + s.substring(1));
        }


    }
}
