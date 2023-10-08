public class SauceDecorator extends Decorator {
    public SauceDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", added Sauce";
    }

    @Override
    public int getCost() {
        return super.getCost() + 150;
    }
}
