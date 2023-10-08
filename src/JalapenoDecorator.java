public class JalapenoDecorator extends Decorator {
    public JalapenoDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", added Jalapeno";
    }

    @Override
    public int getCost() {
        return super.getCost() + 200;
    }
}
