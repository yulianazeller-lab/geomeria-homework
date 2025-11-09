package speakdragonwork;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть данi для дракона:");
        System.out.print("Введіть ім’я: ");
        String name = scanner.nextLine();

        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        System.out.print("Введіть вагу: ");
        double weight = scanner.nextDouble();

        scanner.nextLine();
        Dragon dragon = new Dragon(name, age, weight);
        System.out.println("\nІнформація про дракона:");
        System.out.println(dragon.toString());


        System.out.println("\nДії дракона:");
        dragon.speak();
        dragon.breatheFire();

        scanner.close();
    }
}
