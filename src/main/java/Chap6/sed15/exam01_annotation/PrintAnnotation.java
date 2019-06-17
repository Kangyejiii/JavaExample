package Chap6.sed15.exam01_annotation;

// TODO: 2019-04-20 : Annotation practice

import java.lang.annotation.*;

                                //적용할 수 있는 대상을 배열타입으로 지정
@Target({ElementType.METHOD})   //PrintAnnotation은 Method에만 적용가능
@Retention(RetentionPolicy.RUNTIME)//유지정책
public @interface PrintAnnotation {
    String value() default "-";
    //타입이 String인  value라는 Element 선언 ()는는 무조건 붙인다.

    int number() default 15;

}
