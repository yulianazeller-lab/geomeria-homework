package speakdragonwork_enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім’я дракона: ");
        String name = scanner.nextLine();

        System.out.print("Вік дракона: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Вага дракона: ");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Оберіть колiр дракона: ЧЕРВОНИЙ, ЗЕЛЕНИЙ, ЖОВТИЙ, ЧОРНИЙ, БЛАКИТНИЙ");
        DragonType type = DragonType.valueOf(scanner.nextLine().toUpperCase());

        Dragon dragon = new Dragon(name, age, weight, type);

        System.out.println("\n🧾 Інформація про дракона:");
        System.out.println(dragon);
        dragon.speak();
        dragon.breatheFire();

        scanner.close();
    }

    }
