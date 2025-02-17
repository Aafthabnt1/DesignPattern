package abstractfactorypattern;

public class LuxuaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String name) {
        switch (name) {
            case "AUDI":
                return new Audi();
            case "MERCEDESBENZ":
                return new MercedesBenz();
            default:
                return null;
        }
    }
}
