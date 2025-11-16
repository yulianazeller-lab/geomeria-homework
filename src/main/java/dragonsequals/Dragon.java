package dragonsequals;

import java.util.Objects;

public class Dragon {
    private String name;
    private int age;
    private double weight;
    private Dragontype type;
    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }
    public Dragon(String name, int age, double weight, Dragontype type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        System.out.println("Створено повноцінного дракона");
    }
    public void speak() {
        System.out.println(name + " каже: Рррррр!");
    }
    public void breatheFire() {
        System.out.println(name + " випускає вогонь! 🔥");
    }
    @Override
    public String toString() {
        return "Дракон: " + name + ", Вік: " + age + ", Вага: " + weight + " кг, Тип: " + type;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dragon other = (Dragon) obj;
        return age == other.age &&
                Double.compare(other.weight, weight) == 0 &&
                Objects.equals(name, other.name) &&
                type == other.type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, type);
    }
}
