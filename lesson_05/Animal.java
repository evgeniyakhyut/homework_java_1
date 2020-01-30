//Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
//Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина,
// означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
// плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
//При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
//** Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public class Animal {
    String name;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;
    protected double maxDistanceJump;

    public Animal(String name) { this.name = name; }

    //** Добавить животным разброс в ограничениях.
    // То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
    // Некоторые животные не могут плавать, поэтому конструкторов два.
    public Animal(String name, int maxDistanceRun, double maxDistanceJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
    }

    public Animal(String name, int maxDistanceRun, int maxDistanceSwim, double maxDistanceJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        this.maxDistanceJump = maxDistanceJump;
    }

    public void run(double distance) {

        if (distance > maxDistanceRun) {
            System.out.println(this.name + " не смог столько пробежать.");
        } else {
            System.out.println(this.name + " пробежал!");
        }
    }

    public void swim(double distance) {

        if (distance > maxDistanceSwim) {
            System.out.println(this.name + " не смог столько проплыть.");
        } else {
            System.out.println(this.name + " проплыл!");
        }
    }

    public void jump(double distance) {

        if (distance > maxDistanceJump) {
            System.out.println(this.name + " не смог так высоко прыгнуть.");
        } else {
            System.out.println(this.name + " прыгнул!");
        }

    }

}

