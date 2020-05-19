import Animal.Animal;
import Animal.Cat;
import Animal.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Баксик");
        cat.run(200);
        cat.swim(600);

        Dog dog = new Dog("Шаман");
        dog.run(300);
        dog.swim(10);

        System.out.printf("Котов создано: %d\nСобак создано: %d\nЖивотных создано: %d", Cat.getCatScore(),
                Dog.getDogScore(), Animal.getAnimalScore());
    }
}
