package Animal;

public class Dog extends Animal {
    private static int dogScore;

    public Dog(String name) {
        this.name = name;
        maxRunDistance = 500;
        maxSwimDistance = 10;
        dogScore++;
    }

    public static int getDogScore() {
        return dogScore;
    }

    @Override
    protected boolean isCanSwim() {
        return true;
    }
}
