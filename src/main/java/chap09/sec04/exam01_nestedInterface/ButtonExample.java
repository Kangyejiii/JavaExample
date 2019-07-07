package chap09.sec04.exam01_nestedInterface;

public class ButtonExample {

    public static void main(String[] args) {
        Button btn = new Button();

        /*CallListener call = new CallListener();
        btn.setOnClickListener(call);*/

        btn.setOnClickListener(new CallListener());
        btn.touch();

        btn.setOnClickListener(new MessageListener());
        btn.touch();

        /*( 이 경우가 더 많음) 익명구현객체*/
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("사진을 찍습니다.");
            }
        });
        btn.touch();

    }

}
