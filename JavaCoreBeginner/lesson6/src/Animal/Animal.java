package Animal;

public abstract class Animal {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    private static int animalScore;

    public Animal() {
        animalScore++;
    }
    public static int getAnimalScore() {
        return animalScore;
    }

    public void run(int runDistance){
        if (runDistance <= maxRunDistance) {
            System.out.printf("%s пробежал %d м\n", name, runDistance);
        } else {
            System.out.printf("%s не может пробежать больше %d м\n", name, maxRunDistance);
        }
    }

    public void swim(int swimDistance){
        if (isCanSwim()) {
            if (swimDistance <= maxSwimDistance) {
                System.out.printf("%s проплыл %d м\n", name, swimDistance);
            } else {
                System.out.printf("%s не может проплыть больше %d м\n", name, maxSwimDistance);
            }
        } else {
            System.out.println(name + " не умеет плавать");
        }
    }

    protected abstract boolean isCanSwim();

}
