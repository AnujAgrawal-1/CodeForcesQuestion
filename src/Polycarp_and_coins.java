import java.util.Scanner;

public class Polycarp_and_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int value = n / 3;
            int add_value = Math.abs((3 * value) - n);

            if (add_value > 0) {
                if (add_value ==1) {
                    System.out.println(value + add_value + " " + value);
                } else {
                    System.out.println(value + " " + (value+1));

                }
            } else {
                System.out.println(value + " " + value);
            }

        }
    }
}
