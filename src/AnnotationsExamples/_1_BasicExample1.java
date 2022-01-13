package AnnotationsExamples;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String description();
	int value();
}

@MyAnno(description="First Anno", value=100)
public class _1_BasicExample1 {
	public static void main(String[] args) {
		Class d=_1_BasicExample1.class;
		
		for(Annotation a:d.getAnnotations()){
			System.out.println(a);
		}
	}
}
