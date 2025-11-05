package autotuv;

import java.time.LocalDate;

public class Pkw {
    private double tankvolume;
    private double verbrauch;
    private int tuv;

    public Pkw(double tankvolume, double verbrauch, int tuv) {
        this.tankvolume = tankvolume;
        this.verbrauch = verbrauch;
        this.tuv = tuv;
    }
    public boolean los() {
        return tankvolume > 0;
    }
    public boolean tuvgultig() {
        int Jahr = LocalDate.now().getYear();
        return Jahr <= tuv;
    }
    public double reichweite() {
        if (verbrauch == 0) return 0;
        return (tankvolume / verbrauch) * 100;
    }
    public void info() {
        System.out.println("Заповненість бака: " + tankvolume + " л");
        System.out.println("Витрата палива: " + verbrauch + " л/100 км");
        System.out.println("Рік наступного техогляду: " + tuv);
        System.out.println("Може їхати: " + los());
        System.out.println("Допущена до експлуатації: " + tuvgultig());
        System.out.println("Максимальна відстань: " + reichweite() + " км");
    }
}
