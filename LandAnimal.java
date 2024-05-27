public class LandAnimal extends Animal {
    @Override
    String move() {
        return "swings on trees";
    }

    public static void main(String[] args) {
        LandAnimal tiger = new LandAnimal();
        LandAnimal antelope = new LandAnimal();
        tiger.name = "brad";
        antelope.move();
        System.out.println(tiger.name);
        System.out.println(antelope.move());
    }

}
