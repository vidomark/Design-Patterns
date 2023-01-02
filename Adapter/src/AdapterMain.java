public class AdapterMain {
    public static void main(String[] args) {
        Car car = new ConcreteCar();
        CarAdapter adaptedCar = new CarAdapterImpl(car);

        car.getSpeedInKph();
        adaptedCar.getSpeedInMph();
    }
}