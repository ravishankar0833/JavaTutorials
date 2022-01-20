package AnnotationsExamples;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(myRepeatedAnnos.class)
@interface MyAnno11{
	String name() default "defaut value";
	int value() default 100;
}

@Retention(RetentionPolicy.RUNTIME)
@interface myRepeatedAnnos{
	MyAnno11[] value();
}

public class _5_RepeatedAnnotations {

	@MyAnno11(value=-1)
	@MyAnno11(name="this is method anno2")
	public static void myMethod(String str, int i) {
		_5_RepeatedAnnotations ob= new _5_RepeatedAnnotations();
		
		try {
			Class<?> c = ob.getClass();
			
			Method m = c.getMethod("myMethod", String.class,int.class);
			
			myRepeatedAnnos anno = m.getAnnotation(myRepeatedAnnos.class);
			
			System.out.println(anno);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMethod("test", 10);
	}
	
}
