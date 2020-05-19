import competitors.Cat;
import competitors.Competitor;
import competitors.Human;
import competitors.Robot;
import obstacles.Obstacles;
import obstacles.Treadmill;
import obstacles.Wall;

public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Сергей", 500, 3),
                new Cat("Пикси", 200, 2),
                new Robot("Мистер Робот", 1000, 4)
        };

        Obstacles[] obstacles = {
                new Wall(1),
                new Treadmill(150),
                new Wall(3),
                new Treadmill(200),
                new Wall(4),
                new Treadmill(600),
        };

        for (Competitor competitor : competitors) {
            for (Obstacles obstacle : obstacles) {
                if (competitor.isOnDistance()){
                    obstacle.doIt(competitor);
                }
            }
        }

        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
