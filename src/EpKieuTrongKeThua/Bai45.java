package EpKieuTrongKeThua;

public class Bai45 {
    public static void main(String[] args) {
        // Ép kiểu lên
        Animal cat = new Cat("Fish");
        cat.move();
        cat.eat();
        cat.sleep();
//        cat.washFace(); // Error
        // Ép kiểu xuống
        if(cat instanceof Cat) {
            Cat tom = (Cat) cat;
            tom.washFace();
            tom.eat();
            tom.getMouse();
        }
    }
}
