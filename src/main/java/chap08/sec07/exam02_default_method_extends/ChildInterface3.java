package chap08.sec07.exam02_default_method_extends;
/*
* 부모의 디폴트 메소드를 추상메소드로 지정한다. -> 반드시 재정의를 해야한다  */
public interface ChildInterface3 extends ParentInterface  {

    @Override
    public void method2();//추상메소드로 -> 반드시 재정의를 해야한다.

    public void method3();

}
