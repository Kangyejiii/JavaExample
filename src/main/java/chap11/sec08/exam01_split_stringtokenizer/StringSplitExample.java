package chap11.sec08.exam01_split_stringtokenizer;
/**문자열 분리 split()*/
public class StringSplitExample {

    public static void main(String[] args) {
        String text = "학생/학생2,학생3&학생4";
        String []name =text.split("/|,|&");
        for(String names : name){
            System.out.println(names);
        }
    }
}
