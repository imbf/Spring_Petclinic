package org.springframework.samples.petclinic.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Method에다가 Annotation을 붙일 꺼니까 Target은 Method로 해준다.
@Retention(RetentionPolicy.RUNTIME) //언제까지 이 Annotation을 적용할 것이냐? (RUNTIME) 때까지
public @interface LogExecutionTime {

}
