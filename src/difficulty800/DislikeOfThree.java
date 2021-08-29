package difficulty800;

import java.util.Scanner;

public class DislikeOfThree {
     int CalculateKthElement(int k){
         for (int i = 1;  ; i++) {
             if(i%3==0 || i%10==3){
                 continue;
             }
             if(--k==0){
                 return i;
             }
         }
     }

    public static void main(String[] args) {
        DislikeOfThree obj = new DislikeOfThree();
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
           int k= sc.nextInt();
            System.out.println(obj.CalculateKthElement(k));

        }
    }
}
