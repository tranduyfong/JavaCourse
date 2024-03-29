public class Mamal extends Animal {
    private int numberOfLeg;
    private String color;
    private int numberOfTeeth;
    private String tapTinh;

    public Mamal() {
    }

    public Mamal(int numberOfLeg, String color, int numberOfTeeth, String tapTinh) {
        this.numberOfLeg = numberOfLeg;
        this.color = color;
        this.numberOfTeeth = numberOfTeeth;
        this.tapTinh = tapTinh;
    }

    public Mamal(String name, String species, float height, float weight, String habitat, String hinhThucSinhSan,
                 int numberOfLeg, String color, int numberOfTeeth, String tapTinh) {
        super(name, species, height, weight, habitat, hinhThucSinhSan);
        this.numberOfLeg = numberOfLeg;
        this.color = color;
        this.numberOfTeeth = numberOfTeeth;
        this.tapTinh = tapTinh;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public String getTapTinh() {
        return tapTinh;
    }

    public void setTapTinh(String tapTinh) {
        this.tapTinh = tapTinh;
    }
}
