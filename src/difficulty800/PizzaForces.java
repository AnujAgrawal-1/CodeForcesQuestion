package difficulty800;

import java.math.BigInteger;
import java.util.*;
public class PizzaForces{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();
            System.out.println(Long.MAX_VALUE);
            if(n<=6){
                System.out.println(15);
            }else{
                if(n%2==0){
                    System.out.println((n*5)/2);
                }else{
                    System.out.println(BigInteger.valueOf(((n+1)*5)/2));
                }
            }
        }

    }
}