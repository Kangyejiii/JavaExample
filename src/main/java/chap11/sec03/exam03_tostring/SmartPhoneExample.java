package chap11.sec03.exam03_tostring;

import chap08.sec03.exam03_multi_implement_class.SmartTelevision;

public class SmartPhoneExample {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글","안드로이드");
        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
