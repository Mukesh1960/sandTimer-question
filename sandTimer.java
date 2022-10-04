import java.util.*;

public class sandTimer {

    public static Scanner scn = new Scanner(System.in);

    public static void sandTimerPattern(int n) {
        int nsp = n - n;
        int nst = 1;
        int nspp = n - 2;
        int nstt = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            for (int cspp = 1; cspp <= nspp; cspp++) {
                if (row == 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int cstt = 1; cstt <= nstt; cstt++) {
                if (row == (n / 2) + 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (row <= n / 2) {
                nsp++;
                nspp -= 2;
            } else {
                nsp--;
                nst += 2;
                nspp = 0;
                nstt = 0;
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        sandTimerPattern(scn.nextInt());
    }

}
