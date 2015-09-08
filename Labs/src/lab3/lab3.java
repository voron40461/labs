package lab3;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eps = scanner.nextDouble();

        double sum = 0;
        int num = 1;
        int sign = 1;

        while (Math.abs(4 * sum - Math.PI) > eps) {
            sum += 1.0 / (num * sign);
            sign *= -1;
            num += 2;
        }

        int invEps = (int)(1 / eps);
        if (invEps % 10 == 9)
            invEps++;
        else
            if (invEps % 10 == 1)
                invEps--;

        System.out.println("My PI = " + ((int)(4 * sum * invEps)) / (invEps * 1.0));

        scanner.close();
    }
}
