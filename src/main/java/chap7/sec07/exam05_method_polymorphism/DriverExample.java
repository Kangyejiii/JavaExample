package chap7.sec07.exam05_method_polymorphism;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //Vehicle 타입이지만 자식객체도 가능
        driver.drive(bus);
        driver.drive(taxi);
    }
}
