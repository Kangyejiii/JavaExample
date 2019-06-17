package Chap5.sec06.exam07_array_copy;

public class ArrayCopyExmaple {
    public static void main(String[] args) {
        String[] oldStrArray={"java","array","copy"};
        String[] newStrArray=new String[5];

        System.arraycopy(oldStrArray,1,newStrArray,0,oldStrArray.length-1);

        for(String e: newStrArray){
            System.out.println(e);
        }

    }
}
