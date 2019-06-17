package Chap6.example.exercise_18;

public class ShopService {

    private static ShopService shopService = new ShopService();
        //객체 생성

    private ShopService(){ }    //private으로 생성자

    static ShopService getInstance(){
        return shopService;
    }

}
