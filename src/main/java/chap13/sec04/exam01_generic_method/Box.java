package chap13.sec04.exam01_generic_method;
/** 제네릭 타입*/
public class Box<T> {
    private T t;

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }

}
