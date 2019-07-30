package chap14.sec05.exam07_andthen_compose;

import java.util.function.Function;

/**Function 함수적 인터페이스 : 매개값과 리턴 값이 있고 applyXX() 메소드  매개값을 리턴값으로
 * 매핑(타입 변환) 하는 역할을 한다.
 *
 * */
public class FunctionAndThenComposeExample {

    public static void main(String[] args) {
        Function<Member,Address> functionA;
        Function<Address,String> functionB;
        Function<Member,String> functionAB;
        String city;

        functionA = (m) -> m.getAddress();
        functionB = (a) -> a.getCity();


        functionAB = functionA.andThen(functionB);
        city=functionAB.apply(
                new Member("딩예","dingye",new Address("Korea","seoul"))
        );

        System.out.println("거주 도시 : " +city );

        functionAB = functionB.compose(functionA);
        city=functionAB.apply(
                new Member("딩예","dingye",new Address("Korea","seoul"))
        );

        System.out.println("거주 도시 : " +city );



    }

}
