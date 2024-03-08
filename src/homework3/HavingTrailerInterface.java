package homework3;

public interface HavingTrailerInterface extends HavingAnEngineInterface {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
