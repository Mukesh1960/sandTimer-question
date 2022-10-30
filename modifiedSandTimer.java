import java.util.*;

public class rotateArray {

    public static Scanner scn = new Scanner(System.in);

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] rotate(int[] arr, int r) {
        int n = arr.length;
        r = r % n;
        if (r < 0) {
            r = r + n;
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = (i + r) % n;
            arr2[idx] = arr[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input2(n);
        int r = scn.nextInt();
        int[] arr2 = rotate(arr, r);
        display(arr2);
    }
}

// import java.util.*;

// public class rotateArray {

// public static Scanner scn = new Scanner(System.in);

// public static void input(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// arr[i] = scn.nextInt();
// }
// }

// public static int[] input2(int n) {
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = scn.nextInt();
// }
// return arr;
// }

// public static void display(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]);
// }
// }
// public static int[] rotate(int[] arr , int r) {
// int n = arr.length;
// r = r % n;
// if (r < 0) {
// r = r + n;
// }

// int[] arr2 = new int[n];

// for (int i = 0; i < n; i++) {
// int idx = (i + r) % n;
// arr2[idx] = arr[i];
// }
// return arr2;
// }

// public static void main(String[] args) {
// int n = scn.nextInt();
// int r = scn.nextInt();
// int[] arr = input2(n);
// int[] arr2 = rotate(arr , r);
// display(arr2);
// }
// }
