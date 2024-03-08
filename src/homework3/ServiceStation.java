package homework3;

public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        if (transport instanceof HavingAnEngineInterface) ((HavingAnEngineInterface) transport).checkEngine();
        if (transport instanceof HavingTrailerInterface) ((HavingTrailerInterface) transport).checkTrailer();
    }
}

