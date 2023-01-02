public class CarAdapterImpl implements CarAdapter {

    private final Car car;

    private final static double MPH_TO_KPH = 1.609344;

    public CarAdapterImpl(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeedInMph() {
        return car.getSpeedInKph() * MPH_TO_KPH;
    }
}
