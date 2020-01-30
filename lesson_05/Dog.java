public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        int dogMaxDistanceRun = 500;
        int dogMaxDistanceSwim = 10;
        double dogMaxDistanceJump = 0.5;
        this.maxDistanceRun = dogMaxDistanceRun;
        this.maxDistanceSwim = dogMaxDistanceSwim;
        this.maxDistanceJump = dogMaxDistanceJump;
    }

    public Dog(String name, int maxDistanceRun, int maxDistanceSwim, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceSwim, maxDistanceJump);
    }
}
