import java.util.Random;
import java.util.Scanner;

public class Method_BT_HienThiMaTranNhiPhan {
    public static void main(String[] args) {
        int matrix[][];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao kich co cua ma tran: ");
        System.out.print("n = ");
        n = scanner.nextInt();
        matrix = new int[n][n];
        System.out.println("Ta co ma tran co n*n la: ");
        MaTranNhiPhan(matrix, n);
        HienThi(matrix, n);
    }

    public static void MaTranNhiPhan(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random rd = new Random();
                matrix[i][j] = rd.nextInt();
            }
        }
    }

    public static void HienThi(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}