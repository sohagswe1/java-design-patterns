interface Vehicle {
    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }
}

class VehicleFactory {

    public Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        }

        else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }

        throw new IllegalArgumentException("Invalid vehicle type");
    }
}

public class FactoryPattern {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("car");
        v1.start();

        Vehicle v2 = factory.getVehicle("bike");
        v2.start();

        Vehicle v3 = factory.getVehicle("truck");
        v3.start();
    }
}