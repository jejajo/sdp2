
public class Main {
    public static void main(String[] args) {
        Food food = new Doner();

        food = new SauceDecorator(food);
        food = new JalapenoDecorator(food);

        System.out.println("Order: " + food.getDescription());
        System.out.println("Cost: " + food.getCost() + " tenge");

    }
}