import java.util.Scanner;

public class RegularBracketSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            char [] str= new char[2*n];
            char s1='(';
            char s2=')';
            for (int i = 0; i < n; i++) {
                str[i]=s1;
            }
            for (int i = n; i < 2*n; i++) {
                str[i]=s2;
            }
            System.out.println(str);
            for (int i = n-1; i >0 ; i--) {
                for (int j = n; j < 2*n; j++) {
                    char ch=str[j];
                    str[j]=str[n-1];
                    str[n-1]=ch;

                }
                System.out.println(str);
            }

        }

    }
}
//(((((((((())))))))))
//((((((((()()))))))))
//(((((((()(()))))))))
