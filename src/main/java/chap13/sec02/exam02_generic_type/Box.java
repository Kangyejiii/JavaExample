package chap13.sec02.exam02_generic_type;
/** 제네릭 타입*/
public class Box <T> {
    private T t;

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }

}
