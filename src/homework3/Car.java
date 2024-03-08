package homework3;

public class Car extends MotorTransport implements Maintainable{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем колесо автомобиля");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    @Override
    public void check() {
       updateTyre();
       checkEngine();
    }

    @Override
    public String toString() {
        return "автомобиль";
    }
}
