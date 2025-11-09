package arrayscannerhomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введіть " + n + " бажаних цілих чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        int choice;
        do {
            System.out.println("\nВарiанти можливих дiй:");
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне всіх елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");
            System.out.print("Я вибираю: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    System.out.println("Сума всiх "+ n + " елементів: " + sum);
                    break;
                case 2:
                    double average = 0;
                    for (int num : array) {
                        average += num;
                    }
                    average /= n;
                    System.out.println("Середнє арифметичне: " + average);
                    break;
                case 3:
                    int max = array[0];
                    for (int num: array) {
                        if (num > max) {
                            max = num;
                        }
                    }
                    System.out.println("Найбільший елемент: " + max);
                    break;
                case 4:
                    System.out.println("Завершення програми...Чузззз");
                    break;
                default:
                    System.out.println("Невірно введенi данi!");
            }
        } while (choice != 4);

        scanner.close();
    }
}


