package competitors;

public class Cat implements Competitor {
    private Delegate delegate;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        delegate = new Delegate(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(int distance) {
        delegate.run(distance);
    }

    @Override
    public void jump(int height) {
        delegate.jump(height);
    }

    @Override
    public void info() {
        delegate.info();
    }

    @Override
    public boolean isOnDistance() {
        return delegate.isOnDistance();
    }
}
