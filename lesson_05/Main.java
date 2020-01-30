public class Main {
    public static void main(String [] args) {

        Animal [] zoo = new Animal[] {
            new Cat("Murka", 300, 2),
            new Bird("Kesha", 20, 0.5),
            new Dog("Bobik", 1000, 200, 5),
            new Horse("Mister", 5000, 500, 1)
        };

        for (int i = 0; i < zoo.length; i++) {
            Animal animal = zoo[i];
            animal.run(10);
            animal.swim(150);
            animal.jump(3);
        }
    }
}
