package homework3;

public class TransportWithTrailer extends MotorTransport implements Maintainable {

    public TransportWithTrailer(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем колесо грузовика");
        }
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void check() {
        checkEngine();
        updateTyre();
        checkTrailer();
    }

    @Override
    public String toString() {
        return "грузовик";
    }
}
