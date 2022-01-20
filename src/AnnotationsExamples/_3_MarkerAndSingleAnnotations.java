package AnnotationsExamples;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnono{
	String name() default "MyAnnotation";
	int value() default 10;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
	String single();
}


@MyAnnono()
@MyMarker
@MySingle(single="class single annotation")
public class _3_MarkerAndSingleAnnotations {

	@MyAnnono(name="method anno", value=10000)
	@MySingle(single="class single annotation")
	public static void main(String[] args) {
		
		
		_3_MarkerAndSingleAnnotations d=new _3_MarkerAndSingleAnnotations();
		
		System.out.println("Class annotations");

		for (Annotation anno: d.getClass().getAnnotations()) {
			System.out.println(anno);
		}
		
		System.out.println("Method annotations");

		for (Method methods: d.getClass().getMethods()) {
			for(Annotation anno:methods.getAnnotations()) {
				System.out.println(anno);
			}
		}
	}
	
}
