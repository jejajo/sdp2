public abstract class Decorator implements Food {
    protected Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    @Override
    public int getCost() {
        return food.getCost();
    }
}
