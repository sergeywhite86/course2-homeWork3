package homework3;

public interface HavingWheelsInterface {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
