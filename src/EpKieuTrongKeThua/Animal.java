package EpKieuTrongKeThua;

public class Animal {
    private String name;
    private float weight;
    private String color;

    public void move() {
        System.out.println(name + " đang di chuyển");
    }
    public void eat() {
        System.out.println(name + " đang ăn");
    }
    public void sleep() {
        System.out.println(name + " đang ngủ");
    }

    public Animal() {
    }

    public Animal(String name, float weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
