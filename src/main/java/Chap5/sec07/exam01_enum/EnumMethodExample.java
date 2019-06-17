package Chap5.sec07.exam01_enum;



public class EnumMethodExample  {
    public static void main(String[] args) {
        Week today=Week.SUNDAY;
        String name=today.name();
        System.out.println(name);

        int ordinal=today.ordinal();
        System.out.println(ordinal);

        Week week1=Week.MONDAY;
        Week week2=Week.WEDNESDAY;
        int compare1=week1.compareTo(week2);
        System.out.println(compare1);
        int compare2=week2.compareTo(week1);
        System.out.println(compare2);

        Week weekday=Week.valueOf("SUNDAY");
        System.out.println(weekday);
        if(weekday==Week.SUNDAY){
            System.out.println("일요일이네!");
        }

        Week[] days=Week.values();  //열거타입의 모든 열거 객체들을 배열로 만들어 리턴
        for(Week day:days){
            System.out.println(day);
        }



    }
}
