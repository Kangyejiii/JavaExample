package chap7.sec08.exam01_abstract_class;

public class PhoneExample {

    public static void main(String[] args) {
       // Phone phone = new Phone() ;

        SmartPhone smartPhone = new SmartPhone("강옞");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
