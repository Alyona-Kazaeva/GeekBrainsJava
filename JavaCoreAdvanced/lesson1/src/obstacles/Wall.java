package obstacles;

import competitors.Competitor;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
        if (competitor.isOnDistance()) {
            System.out.println("Перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.printf("Не смог перепрыгнуть стену высотой %d метров\n", height);
        }
    }
}
