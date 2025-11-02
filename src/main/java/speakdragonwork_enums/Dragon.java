package speakdragonwork_enums;

public class Dragon {
    private String name;
    private int age;
    private double weight;
    private DragonType type;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight, DragonType type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        System.out.println("Створено повноцінного дракона");
    }
    public void speak() {
        System.out.println(name + " каже: Guteeen Taaag, я дракон!");
    }
    public void breatheFire() {
        System.out.println(name + " випускає вогонь! 🔥");
    }
    @Override
    public String toString() {
        return "Дракон: " + name + ", Вік: " + age + ", Вага: " + weight + " кг, Тип: " + type;
    }


}
