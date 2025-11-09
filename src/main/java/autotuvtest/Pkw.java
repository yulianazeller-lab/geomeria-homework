package autotuvtest;

import java.time.LocalDate;

public class Pkw {
    private double tankvolume;
    private double verbrauch;
    private int tuvbis;

    public Pkw(double tankvolume, double verbrauch, int tuvbis) {
        this.tankvolume = tankvolume;
        this.verbrauch = verbrauch;
        this.tuvbis = tuvbis;
    }
    public boolean los() {
        return tankvolume > 0;
    }
    public boolean tuvbis() {
        return LocalDate.now().getYear() <= tuvbis;
    }
    public double reichweite() {
        return verbrauch == 0 ? 0 : (tankvolume / verbrauch) * 100;
    }
    public String info() {
        return "Бак: " + tankvolume + " л, Витрата: " + verbrauch +
                " л/100км, Техогляд до: " + tuvbis;
    }

}
