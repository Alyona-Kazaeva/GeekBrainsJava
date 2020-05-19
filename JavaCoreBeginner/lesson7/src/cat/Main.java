package cat;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Пикси");
        cats[2] = new Cat("Баксик");
        cats[3] = new Cat("Ириска");
        cats[4] = new Cat("Пушистик");
        Plate plate = new Plate(35);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() +  " " + cat.isFeedUp());
        }

        plate.addFood(100);
    }
}
