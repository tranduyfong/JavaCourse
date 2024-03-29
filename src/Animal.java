//Bài 1. Lớp động vật gồm các thông tin: tên, loài, chiều cao, cân nặng, môi trường sống, hình thức
//sinh sản(đẻ con, đẻ trứng). Hành động của động vật gồm ăn ngủ nghỉ, di chuyển và giải trí(tắm,
//húc nhau chẳng hạn).h Động vật có vú kế từa từ động vật và có thêm thông tin về số chân, màu
//lông, số răng, tập tính. Chim kế thừa từ động vật và có thêm các đặc điểm màu lông, thức ăn
//chính, sải cánh. Cá kế thừa từ động vật và có thêm các thông tin về màu sắc, thức ăn. Mèo kế
//thừa từ động vật có vú, có thêm các thông tin về tuổi, sở thích, màu mắt, tên gọi riêng(pet name).
//Thiết kế các lớp mô tả mối quan hệ kế thừa như trên.

public class Animal {
    private String name;
    private String species;
    private float height;
    private float weight;
    private String habitat;
    private String hinhThucSinhSan;

    public Animal() {
    }

    public Animal(String name, String species, float height, float weight, String habitat, String hinhThucSinhSan) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.habitat = habitat;
        this.hinhThucSinhSan = hinhThucSinhSan;
    }

    public void doEat() {
        System.out.println(name + " đang ăn ...");
    }
    public void doSleep() {
        System.out.println(name + " đang ngủ ...");
    }
    public void doRest() {
        System.out.println(name + " đang nghỉ ngơi ...");
    }
    public void doMove() {
        System.out.println(name + " đang di chuyển ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHinhThucSinhSan() {
        return hinhThucSinhSan;
    }

    public void setHinhThucSinhSan(String hinhThucSinhSan) {
        this.hinhThucSinhSan = hinhThucSinhSan;
    }
}