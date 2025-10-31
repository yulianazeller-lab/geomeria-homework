package speakdragonwork;

public class Dragon {
    private String name;
    private int age;
    private double weight;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }
    public Dragon(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("Створено повноцінного дракона");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void speak() {
        System.out.println(name + " каже: \"Guteeen Taaag, я дракон!\"");
    }

    public void breatheFire() {
        System.out.println(name + " випускає вогонь! 🔥");
    }

    @Override
    public String toString() {
        return "Дракон: Ім’я = " + name + ", Вік = " + age + ", Вага = " + weight;
    }
}
