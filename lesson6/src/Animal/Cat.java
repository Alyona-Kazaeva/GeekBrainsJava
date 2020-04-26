package Animal;

public class Cat extends Animal {
    private static int catScore;

    public Cat(String name) {
        this.name = name;
        maxRunDistance = 200;
        catScore++;
    }

    public static int getCatScore() {
        return catScore;
    }

    @Override
    protected boolean isCanSwim() {
        return false;
    }

}
