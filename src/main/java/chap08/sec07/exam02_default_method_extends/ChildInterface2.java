package chap08.sec07.exam02_default_method_extends;
/*
* 하위 인터페이스에서 상위 인터페이스의 디폴트 메소드 재정의
* */
public interface ChildInterface2 extends ParentInterface  {

    @Override
    default void method2() {
        System.out.println("ChildInterface2-method2");
    }

    public void method3();

}
