import java.util.Scanner;

public class Alphabetical_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            solve(s);
        }
    }

    private static void solve(String s) {
        if (s.contains("a")) {
            int pos = s.indexOf("a");
            int L = pos;
            int R = L;
            int i;
            for (i = 1; i < s.length(); i++) {
                if (L - 1 > -1 && R + 1 < s.length()) {
                    if (s.charAt(L - 1) == 'a' + i) {
                        L = L - 1;
                    } else {
                        if (s.charAt(R + 1) == 'a' + i)
                            R = R + 1;
                        else {
                            System.out.println("No");
                            break;
                        }
                    }

                }
                else {
                    if (L - 1 > -1) {
                        if (s.charAt(L - 1) == 'a' + i) {
                            L = L - 1;
                        } else {
                            System.out.println("No");
                            break;
                        }
                    }
                    if (R + 1 < s.length()) {
                        if (s.charAt(R + 1) == 'a' + i) {
                            R = R + 1;
                        } else {
                            System.out.println("No");
                            break;
                        }
                    }
                }

            }
            if (i == s.length())
                System.out.println("Yes");
        } else System.out.println("No");
    }
}