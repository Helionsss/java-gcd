import java.util.Arrays;
import java.util.Scanner;
class Main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();

                while (a != 0 && b != 0) {
                        if (a > b) {
                                a %= b;
                        } else {
                                b %= a;
                        }
                }
                System.out.println(a + b);
                System.out.println(gcd(a, b));
        }

        public static int gcd(int a, int b) {
                return b == 0 ? a : gcd(b,a % b);
        }
}