package homework3;

public class ServiceStation {
    public void check(Maintainable transport) {
        System.out.println("Обслуживаем " + transport);
        transport.check();
    }
}

