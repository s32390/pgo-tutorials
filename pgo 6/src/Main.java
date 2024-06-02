public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 500, 20);
        Truck truck = new Truck("Ford", "F-150", 2018, 300, 25, 2);

        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mpg");
    }
}