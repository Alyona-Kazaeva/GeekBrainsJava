package cat;

public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    private void info() {
        System.out.println("Еды в тарелке : " + food);
    }

    boolean decreaseFood(int amount, String name) {
        if (food - amount < 0) {
            System.out.println(name + " не поел, еды недостаточно");
            return  false;
        } else {
            food -= amount;
            System.out.println(name + " наелся");
            return true;
        }
    }

    void addFood(int amount){
        food+=amount;
        info();
    }
}
