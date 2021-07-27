import java.util.Scanner;

public class Putting_Plates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int a[][] = new int[h][w];
            solve(a, h, w);
            System.out.println();
        }
    }

    private static void solve(int[][] a, int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 && j == 0) {
                    if (a[i + 1][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j + 1] == 0) {
                        a[i][j] = 1;
                    }
                } else {
                    if (i == 0 && j == w - 1) {
                        if (a[i][j - 1] == 0 && a[i + 1][j] == 0 && a[i + 1][j - 1] == 0) {
                            a[i][j] = 1;
                        }
                    } else {
                        if (i == h - 1 && j == 0) {
                            if (a[i - 1][j] == 0 && a[i][j + 1] == 0 && a[i - 1][j + 1] == 0) {
                                a[i][j] = 1;
                            }
                        } else {
                            if (i == h - 1 && j == w - 1) {
                                if (a[i - 1][j] == 0 && a[i][j - 1] == 0 && a[i - 1][j - 1] == 0) {
                                    a[i][j] = 1;
                                }
                            } else {
                                if (i == 0) {
                                    if (a[i][j - 1] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j - 1] == 0 && a[i + 1][j + 1] == 0) {
                                        a[i][j] = 1;
                                    }
                                }
                                if (i == h - 1) {
                                    if (a[i - 1][j] == 0 && a[i][j - 1] == 0 && a[i][j + 1] == 0 && a[i - 1][j - 1] == 0 && a[i - 1][j + 1] == 0) {
                                        a[i][j] = 1;
                                    }
                                }
                                if (j == 0) {
                                    if (a[i - 1][j] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0 && a[i - 1][j + 1] == 0 && a[i + 1][j + 1] == 0) {
                                        a[i][j] = 1;
                                    }
                                }
                                if (j == w - 1) {
                                    if (a[i - 1][j] == 0 && a[i][j - 1] == 0 && a[i + 1][j] == 0 && a[i - 1][j - 1] == 0 && a[i + 1][j - 1] == 0) {
                                        a[i][j] = 1;
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
// if (a[i−1][j]==0 &&a[i][j−1]==0&&a[i + 1][ j]==0&&a[i][ j + 1]==0&&a[i−1][j−1]==0&&a[i−1][j + 1]==0&&a[i + 1][j−1]==0
//                           && a[i + 1][ j + 1]==0)
