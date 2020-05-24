package obstacles;

import competitors.Competitor;

public class Treadmill implements Obstacles {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
        if (competitor.isOnDistance()) {
            System.out.println("Успешно пробежал  " + distance + " метров");
        } else {
            System.out.printf("Не смог пробежать %d метров\n", distance);
        }
    }
}
