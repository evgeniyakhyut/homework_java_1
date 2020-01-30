public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        int birdMaxDistanceRun = 5;
        double birdMaxDistanceJump = 0.2;
        this.maxDistanceRun = birdMaxDistanceRun;
        this.maxDistanceJump = birdMaxDistanceJump;
    }

    public Bird(String name, int maxDistanceRun, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceJump);
    }

    @Override
    public void swim(double distance) {
        System.out.println(this.name + " не плавает по условию.");
    }
}
