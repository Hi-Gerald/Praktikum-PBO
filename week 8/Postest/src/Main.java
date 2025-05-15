import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String nama;
    protected String metodeStart;
    protected String tipe;

    public Vehicle(String nama, String metodeStart, String tipe) {
        this.nama = nama;
        this.metodeStart = metodeStart;
        this.tipe = tipe;
    }

    public String getNama() {
        return nama;
    }

    public String getMetodeStart() {
        return metodeStart;
    }

    public String getTipe() {
        return tipe;
    }

    public abstract void startEngine();
}

class Car extends Vehicle {
    private String kelasMobil;

    public Car(String nama, String metodeStart, String kelasMobil) {
        super(nama, metodeStart, "Car");
        this.kelasMobil = kelasMobil;
    }

    @Override
    public void startEngine() {
        System.out.println("Car " + nama + " starts with " + metodeStart);
    }

    public String getKelasMobil() {
        return kelasMobil;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasAggressiveLook;

    public Motorcycle(String nama, String metodeStart, boolean hasAggressiveLook) {
        super(nama, metodeStart, "Motorcycle");
        this.hasAggressiveLook = hasAggressiveLook;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle " + nama + " starts with " + metodeStart);
    }

    public boolean hasAggressiveLook() {
        return hasAggressiveLook;
    }
}

class Driver {
    private String nama;
    private String licenseType;

    public Driver(String nama, String licenseType) {
        this.nama = nama;
        this.licenseType = licenseType;
    }

    public String getNama() {
        return nama;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public boolean canDrive(Vehicle vehicle) {
        if (vehicle.getTipe().equals("Car") && licenseType.equals("B")) {
            return true;
        } else if (vehicle.getTipe().equals("Motorcycle") && licenseType.equals("A")) {
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Avanza", "Mesin Mobil (startEngine)", "Family Car"));
        vehicles.add(new Motorcycle("Ninja", "Mesin Motor (startEngine)", true));

        
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Gerald", "B"));
        drivers.add(new Driver("Eberhard", "A"));

        
        System.out.println("=== Pengelompokan Kendaraan ===");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Kendaraan: " + vehicle.getNama() + " | Tipe: " + vehicle.getTipe());
            vehicle.startEngine();

            
            System.out.println("Driver yang dapat mengendarai:");
            for (Driver driver : drivers) {
                if (driver.canDrive(vehicle)) {
                    System.out.println("- " + driver.getNama() + " (License: " + driver.getLicenseType() + ")");
                }
            }
            System.out.println();
        }
    }
}