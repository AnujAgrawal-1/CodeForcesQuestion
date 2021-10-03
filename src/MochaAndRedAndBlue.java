import java.util.Scanner;

public class MochaAndRedAndBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            String s1 = "";
            if(ch.length==1){
                if(s.charAt(0)=='?'){
                    s1=s1+'B';
                }
                else{
                    s1=s1+s.charAt(0);
                }
            }else {
                for (int i = 0; i < s.length() - 1; i++) {
                    if (ch[i] == '?') {
                        if (ch[i + 1] == 'B') {
                            s1 = s1 + "R";
                        } else {
                            if (ch[i + 1] == 'R') {
                                s1 = s1 + "B";
                            } else {
                                if (i != 0) {
                                    if (s1.charAt(i - 1) == 'R') {
                                        s1 = s1 + "B";
                                    } else {
                                        if (s1.charAt(i - 1) == 'B') {
                                            s1 = s1 + "R";
                                        }
                                    }
                                } else {
                                    s1 = s1 + "R";
                                }
                            }
                        }
                    } else {
                        s1 = s1 + s.charAt(i);
                    }

                }
                if (s1.charAt(s1.length() - 1) == 'R')
                    s1 = s1 + 'B';
                else
                    s1 = s1 + 'R';
            }

            System.out.println(s1);
        }
    }
}
//?R???BR
//->BRB