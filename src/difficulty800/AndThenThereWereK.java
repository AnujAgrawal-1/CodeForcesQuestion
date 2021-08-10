package difficulty800;

import java.util.Scanner;

public class AndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int bits=countSetBit(n);
            int size = sizeOfBits(n);
            System.out.println((int)Math.pow(2,size-1)-1);
            System.out.println("bits:"+bits);

        }
    }

    private static int sizeOfBits(int n) {
        int size= (int)(Math.log10(n)/Math.log10(2))+1;
        return size;
    }

    private static int countSetBit(int n) {
        int count=0;
        while(n>0) {
            count += n & 1;
            n=n>>1;
        }
        return count;
    }
}
