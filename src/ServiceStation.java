public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            uprate(car);
            car.checkEngine();
        } else if (truck != null) {
            uprate(truck);
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            uprate(bicycle);
        }
    }

    private void uprate(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}