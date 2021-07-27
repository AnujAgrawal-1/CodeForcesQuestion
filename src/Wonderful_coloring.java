import java.util.Scanner;

public class Wonderful_coloring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int l=s.length();
            int[] count =new int[26];
            for (int i = 0; i < l; i++) {
                count[s.charAt(i)-'a']++;
            }
            int ones=0;
            int twos=0;
            for (int i = 0; i < 26; i++) {
                if(count[i]==1)
                    ones++;
                if(count[i]>=2)
                    twos++;
            }
            System.out.println((ones/2)+(twos));

        }
    }
}
