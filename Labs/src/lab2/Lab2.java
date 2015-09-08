package lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        int day, month, year, nextDay, nextMonth, nextYear;
        System.out.println("Введите 3 числа даты через пробел в формате DD MM YYYY: ");

        Scanner scanner = new Scanner(System.in);

        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        scanner.close();

        if (day > 31 || day <= 0 || month > 12 || month <= 0 || year < 0)
        {
            System.out.println("\nНекорректная дата\n");
            return;
        }

        // если в месяце 31 день
        if (month % 2 == 1 && month <= 7 || month % 2 == 0 && month > 7)
        {
            nextDay = day % 31 + 1;
            if (day == 31)
            {
                nextMonth = month % 12 + 1;
                nextYear = year;

                if (month == 12)
                    nextYear++;
            }
            else
            if (day < 31)
            {
                nextMonth = month;
                nextYear = year;
            }
            else
            {
                System.out.println("\nНекорректная дата\n");
                return;
            }
        }
        else // иначе рассматриваем все месяцы с 30 днями, а также февраль
            // с 30 днями
            if (month == 4 || month == 6 || month == 9 || month == 11)
            {
                nextDay = day % 30 + 1;
                nextMonth = month;
                if (day == 30)
                    nextMonth++;
                else
                if (day > 30)
                {
                    System.out.println("\nНекорректная дата\n");
                    return;
                }
                nextYear = year;
            }
            else // остался февраль
            {
                nextYear = year;
                int limit;

                // если год высокосный
                if (year % 4 == 0)
                    limit = 29;
                else
                    limit = 28;

                if (day < limit)
                {
                    nextDay = day + 1;
                    nextMonth = 2;
                }
                else
                if (day == limit)
                {
                    nextDay = 1;
                    nextMonth = 3;
                }
                else
                {
                    System.out.println("\nНекорректная дата\n");
                    return;
                }
            }

        System.out.println("\nДата следующего дня - " + nextDay + "." + nextMonth + "." + nextYear + "\n\n");
    }
}
