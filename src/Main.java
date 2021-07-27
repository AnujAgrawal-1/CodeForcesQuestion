import java.util.Scanner;
public class Main{
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String str1= sc.nextLine();

        if (str.compareToIgnoreCase(str1) <0) System.out.println(-1);
        else if(str.compareToIgnoreCase(str1) >0) System.out.println(1);
        else System.out.println(0);
    }

}

