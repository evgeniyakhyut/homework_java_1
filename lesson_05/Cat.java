public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        int catMaxDistanceRun = 200;
        int catMaxDistanceJump = 2;
        this.maxDistanceRun = catMaxDistanceRun;
        this.maxDistanceJump = catMaxDistanceJump;
    }

    public Cat(String name, int maxDistanceRun, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceJump);
    }

    @Override
    public void swim(double distance) {
        System.out.println("Коты (в том числе " + this.name + ") не плавают. Совсем.");
    }
}
