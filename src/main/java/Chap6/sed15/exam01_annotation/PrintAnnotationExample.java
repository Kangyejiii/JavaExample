package Chap6.sed15.exam01_annotation;
/*
* Service class에 몇개의 method가 있는지 조사
* Service에서 선언된 method의 정보를 배열로 리턴 -> getDeclaredMethods
* 이 method가 어노테이션이 적용 되어있는가 -> method.isAnnotationPresent
* 이 어노테이션에 있는 element 값을 얻기
* */
import java.lang.reflect.Method;

public class PrintAnnotationExample {

    public static void main(String[] args) {

      Method[] declaredMethods =  Service.class.getDeclaredMethods();


      for(Method method : declaredMethods){
          if(method.isAnnotationPresent(PrintAnnotation.class)) {
              PrintAnnotation printAnnotation =
                      method.getAnnotation(PrintAnnotation.class);
          //이 메소드에 적용된 어노테이션을 얻어다오

              //메소드 이름 출력
              System.out.println("{" + method.getName() + "}");

              //구분선 출력
              for (int i = 0; i <printAnnotation.number(); i++) {
                  System.out.print(printAnnotation.value());
              }
              System.out.println();

              try{
                  //메소드 호출
                  method.invoke(new Service());
              }catch (Exception e){

              }
              System.out.println();
          }



      }


    }
}
