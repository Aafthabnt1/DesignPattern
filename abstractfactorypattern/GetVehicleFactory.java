package abstractfactorypattern;

public class GetVehicleFactory {
    public VehicleFactory getVehicleFactory(String name){
        switch (name){
            case "LUXUARY":return new LuxuaryVehicleFactory();
            case "ORDINARY":return new OrdinaryVehicleFactory();
            default:return null;
        }
    }
}
