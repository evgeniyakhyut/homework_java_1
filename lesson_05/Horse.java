public class Horse extends Animal {

    public Horse(String name) {
        super(name);
        int horseMaxDistanceRun = 1500;
        int horseMaxDistanceSwim = 100;
        int horseMaxDistanceJump = 3;
        this.maxDistanceRun = horseMaxDistanceRun;
        this.maxDistanceSwim = horseMaxDistanceSwim;
        this.maxDistanceJump = horseMaxDistanceJump;
    }

    public Horse(String name, int maxDistanceRun, int maxDistanceSwim, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceSwim, maxDistanceJump);
    }
}
