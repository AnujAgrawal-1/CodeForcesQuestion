import java.util.Scanner;

public class Contest_start {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int k = sc.nextInt();
        while (k-->0){
            int n = sc.nextInt();
            int  x = sc.nextInt();
            int t = sc.nextInt();
            int count =0;
            int temp =1;
            while(n-->0){
                temp=temp;
                for (int i = 0; i <n; i++) {//0-5
                    if(temp<=t)
                        count++;
                    else break;
                    temp+=x;
                }
                t=t+x;
            }
            System.out.println(count);

        }
    }

}
