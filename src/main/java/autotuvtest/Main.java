package autotuvtest;

public class Main {
    public static void main(String[] args) {
        Pkw auto = new Pkw(40.0, 8.0, 2026);
        System.out.println("Може їхати: " + auto.los());
        System.out.println("Допущена до експлуатації: " + auto.tuvbis());
        System.out.println("Максимальна відстань: " + auto.reichweite() + " км");
        System.out.println("Інформація: " + auto.info());
    }

}
