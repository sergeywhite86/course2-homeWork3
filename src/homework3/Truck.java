package homework3;

public class Truck extends TransportWithTrailer implements Maintainable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
      super.check();
    }
}
