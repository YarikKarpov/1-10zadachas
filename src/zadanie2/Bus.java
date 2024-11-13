package zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bus {
    String driverName;
    String busNumber;
    String routeNumber;
    String brand;
    int yearOfStart;
    int mileage;


    public Bus(String driverName, String busNumber, String routeNumber, String brand, int yearOfStart, int mileage) {
        this.driverName = driverName;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.yearOfStart = yearOfStart;
        this.mileage = mileage;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driverName='" + driverName + '\'' +
                ", busNumber='" + busNumber + '\'' +
                ", routeNumber='" + routeNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfStart=" + yearOfStart +
                ", mileage=" + mileage +
                '}';
    }
}

class BusManagement {

    public static List<Bus> filterBusesByRoute(List<Bus> buses, String routeNumber) {
        List<Bus> filteredBuses = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getRouteNumber().equals(routeNumber)) {
                filteredBuses.add(bus);
            }
        }
        return filteredBuses;
    }

    public static List<Bus> filterBusesByAge(List<Bus> buses, int years) {
        List<Bus> filteredBuses = new ArrayList<>();
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        for (Bus bus : buses) {
            if ((currentYear - bus.getYearOfStart()) > years) {
                filteredBuses.add(bus);
            }
        }
        return filteredBuses;
    }

    public static List<Bus> filterBusesByMileage(List<Bus> buses, int mileageLimit) {
        List<Bus> filteredBuses = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getMileage() > mileageLimit) {
                filteredBuses.add(bus);
            }
        }
        return filteredBuses;
    }

    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();

        buses.add(new Bus("Алексеев И.О.", "A001", "10", "Mercedes", 2015, 120000));
        buses.add(new Bus("Карпов Я.М.", "B002", "20", "MAN", 2018, 60000));
        buses.add(new Bus("Карпова Л.Е.", "C003", "10", "Iveco", 2013, 150000));
        buses.add(new Bus("Сунцова А.Д.", "D004", "30", "Volvo", 2010, 200000));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер маршрута: ");
        String routeNumber = scanner.nextLine();
        System.out.println("Список автобусов для маршрута " + routeNumber + ":");
        List<Bus> filteredByRoute = filterBusesByRoute(buses, routeNumber);
        filteredByRoute.forEach(System.out::println);

        System.out.print("Введите возраст автобусов (лет): ");
        int age = scanner.nextInt();
        System.out.println("Список автобусов, которые эксплуатируются больше " + age + " лет:");
        List<Bus> filteredByAge = filterBusesByAge(buses, age);
        filteredByAge.forEach(System.out::println);

        System.out.print("Введите пробег автобусов (км): ");
        int mileageLimit = scanner.nextInt();
        System.out.println("Список автобусов, пробег у которых больше " + mileageLimit + " км:");
        List<Bus> filteredByMileage = filterBusesByMileage(buses, mileageLimit);
        filteredByMileage.forEach(System.out::println);

        scanner.close();
    }
}
