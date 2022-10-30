import java.util.*;

public class find2d {

    public static Scanner scn = new Scanner(System.in);

    public static void input1(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean find(int[][] arr, int data) {
        int n = arr.length;
        int m = arr[0].length;
        boolean res = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == data) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int data = scn.nextInt();
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input1(arr);
        find(arr, data);
        display(arr);
    }
}
