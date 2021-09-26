package difficulty800;

import java.math.BigInteger;
import java.util.*;

public class CalculatingFunction {
    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int count=0;
            int n= sc.nextInt();
            sc.nextLine();
            String s= sc.nextLine();
            char arr[]=s.toCharArray();
            int len=arr.length-1;
            for (int i = 0; len>=0 ; i++) {
                if(arr[arr.length-1]=='0'&& arr[len]!='0'){
                    count++;
                    count+=Integer.parseInt(String.valueOf(arr[len]));
                }
                else if(arr[arr.length-1]!='0'){
                    count+=Integer.parseInt(String.valueOf(arr[arr.length-1]));
                    arr[arr.length-1]='0';
                    len++;
                }
                len--;

            }
            System.out.println(count);
        }

    }
}

