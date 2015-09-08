package lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = begin; i <= end; i++) {
            if (isPolyndrom(i) && isPolyndrom(i * i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    private static boolean isPolyndrom(int number) {
        Integer num = number;
        String str = num.toString();
        int strLen = str.length();

        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) != str.charAt(strLen - i - 1))
                return false;
        }

        return true;
    }
}
