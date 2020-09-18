public class Chicken extends Animal implements Edible  {
    @Override
    public String makeSound() {
        return "chíp";
    }

    @Override
    public String howToEat() {
        return "nướng lên ăn";
    }
}
