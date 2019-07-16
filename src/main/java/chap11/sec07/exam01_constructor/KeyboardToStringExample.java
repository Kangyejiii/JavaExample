package chap11.sec07.exam01_constructor;
/** 바이트 배열을 문자열로 변환*/
public class KeyboardToStringExample {

    public static void main(String[] args) throws Exception {
        byte[] bytes = new byte[100];

        System.out.print("입력 : ");
        int readByteNo =System.in.read(bytes);

        String str = new String(bytes,0,readByteNo-2);
        System.out.println(str);
    }
}

