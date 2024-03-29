package EpKieuTrongKeThua;

public class Cat extends Animal {
    private String favouriteFood;

    public Cat() {
    }

    public Cat(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
    public void getMouse() {
        System.out.println(getName() + " đang bắt chuột");
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void washFace() {
        System.out.println(getName() + " đang rửa mặt");
    }
}
