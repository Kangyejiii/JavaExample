package chap09.sec04.exam01_nestedInterface;
/*
*밖에서는 사용하지 않은 인터페이스를 (이 클래스와의 밀접한 관계) 중첩 인터페이스로 선언
* */
public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }

}
