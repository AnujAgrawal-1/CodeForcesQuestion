import java.util.Arrays;
import java.util.Scanner;

public class Love_song {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int q= sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int []arr = new int[str.length()+1];
        arr[0]=0;
        for (int i = 1; i < str.length()+1; i++) {
            arr[i]=arr[i-1]+(str.charAt(i-1)-'a'+1);
        }

        while (q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(arr[r]-arr[l-1]);


            }
        }
    }

