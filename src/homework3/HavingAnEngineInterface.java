package homework3;

public interface HavingAnEngineInterface extends HavingWheelsInterface {
default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
