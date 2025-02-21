package abstractfactorypattern;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String name) {
        switch (name) {
            case "HYUNDAI":
                return new Hyundai();
            case "MAHINDRA":
                return new Mahindra();
            default:
                return null;
        }
    }
}
