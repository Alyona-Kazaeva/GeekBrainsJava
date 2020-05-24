package competitors;

public class Delegate implements Competitor {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean onDistance;

    Delegate(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s начал бег\n", name);
        onDistance = distance <= maxRunDistance;
    }

    @Override
    public void jump(int height) {
        System.out.printf("%s прыгает через стену\n", name);
        onDistance = height <= maxJumpHeight;
    }

    @Override
    public void info() {
        System.out.printf("%s %s\n", name, onDistance ? "успешно преодолел все препятствия" : " выбыл из соревнований");
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
