import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[5][5];
        int current_row = 0;
        int current_column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    current_row=i;
                    current_column=j;
                }

            }
        }
        beautiful_Matrix(current_row,current_column);



    }

    private static void beautiful_Matrix(int row,int column) {
        System.out.println(Math.abs(2 - row) + Math.abs(2 - column));

    }
}
