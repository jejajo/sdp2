public class Doner implements Food {
    @Override
    public String getDescription() {
        return "Doner";
    }

    @Override
    public int getCost() {
        return 1500;
    }
}
