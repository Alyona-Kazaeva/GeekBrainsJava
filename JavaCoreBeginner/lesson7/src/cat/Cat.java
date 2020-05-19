package cat;

public class Cat {
    private String name;
    private final int APPETITE = 10;
    private boolean isFeedUp;

    Cat(String name) {
        this.name = name;
    }

    void eat(Plate plate){
        isFeedUp = plate.decreaseFood(APPETITE, name);
    }

    boolean isFeedUp() {
        return isFeedUp;
    }

    String getName() {
        return name;
    }
}
