package homework3;

public class Bicycle extends Transport implements Maintainable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем колесо велосипеда");
        }
    }

    @Override
    public void check() {
        updateTyre();
    }

    @Override
    public String toString() {
        return "велосипед";
    }
}
