package homework3;

public abstract class MotorTransport extends Transport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public abstract void checkEngine();
}
