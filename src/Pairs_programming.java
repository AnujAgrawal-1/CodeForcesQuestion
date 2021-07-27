import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pairs_programming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < m; i++)
                b[i] = sc.nextInt();
            solve(l, n, m, a, b);

        }
    }

    private static void solve(int k, int n, int m, int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n || j < m) {
            if (i < n && j < m) {
                if (a[i] == 0) {
                    list.add(a[i]);
                    k++;
                    i++;
                } else {
                    if (b[j] == 0) {
                        list.add(b[j]);
                        k++;
                        j++;
                    } else {
                        if (a[i] < b[j] && a[i] <= k) {
                            list.add(a[i]);
                            i++;
                        } else {
                            if (a[i] >= b[j] && b[j] <= k) {
                                list.add(b[j]);
                                j++;
                            } else {
                                System.out.println(-1);
                                return;
                            }
                        }
                    }
                }
            } else {
                if (i < n) {
                    if (a[i] == 0) {
                        list.add(a[i]);
                        k++;
                        i++;
                    } else {
                        if (a[i] <= k) {
                            list.add(a[i]);
                            i++;
                        } else {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
                if (j < m) {
                    if (b[j] == 0) {
                        list.add(b[j]);
                        k++;
                        j++;
                    } else {
                        if (b[j] <= k) {
                            list.add(b[j]);
                            j++;
                        } else {
                            System.out.println(-1);
                            return;
                        }
                    }

                }
            }

        }
        System.out.println(Arrays.toString(list.toArray())
                .replace("[", "").replace(",", "")
                .replace("]", ""));

    }
}

