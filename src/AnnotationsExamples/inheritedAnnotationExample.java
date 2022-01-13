package AnnotationsExamples;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Authenticator.RequestorType;

//inherited annotation to class level will provide the annotation value to inherited class as well 
// if we are not specifying inherited annotation then the annotation will not be inherited or that annotation will not
// be available in the inherited class
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	String name();
}


@MyAnnotation(name="ravi")
class A{
	
}

class B extends A{
	
}

public class inheritedAnnotationExample {

	public static void main(String[] args) {
		A a=new A();
		Class c=a.getClass();
		Annotation an=c.getAnnotation(MyAnnotation.class);
		MyAnnotation annot= (MyAnnotation) an;
		System.out.println(annot.name());
		
		System.out.println(new B().getClass().getAnnotation(MyAnnotation.class).name());
	}
}