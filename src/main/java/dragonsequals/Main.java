package dragonsequals;

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

        System.out.println("Оберіть тип дракона: ЧЕРВОНИЙ, ЗЕЛЕНИЙ, ЖОВТИЙ, ЧОРНИЙ, БЛАКИТНИЙ");
        Dragontype type = Dragontype.valueOf(scanner.nextLine().toUpperCase());

        Dragon dragon1 = new Dragon(name, age, weight, type);
        System.out.println("\n🧾 Інформація про дракона:");
        System.out.println(dragon1);
        dragon1.speak();
        dragon1.breatheFire();

        Dragon dragon2 = new Dragon(name, age, weight, type);

        System.out.println("\nЧи рівні дракони? " + dragon1.equals(dragon2));
        System.out.println("hashcode дракона 1: " + dragon1.hashCode());
        System.out.println("hashcode дракона 2: " + dragon2.hashCode());
        scanner.close();
    }
    }
