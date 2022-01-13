package AnnotationsExamples;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1{
	String str();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface what{
	String description();
}

@what(description="Class Anno")
public class _2_ObtainingMultipleAnnotations {
	
	@MyAnno1(str="This is method anno1", value=1)
	@what(description="This is method anno1")
	public void call(){
		
	}
	
	@MyAnno1(str="This is method anno2", value=5)
	public void me(){
		
	}
	
	@what(description="This is method anno3")
	public static void main(String[] args) {
		Class d=_2_ObtainingMultipleAnnotations.class;
		
		System.out.println("This is class Annotations");
		for(Annotation a:d.getAnnotations()){
			System.out.println(a);
		}
		
		System.out.println("This is method Annotations");
		Method[] ms = d.getMethods();
		for(Method m:ms){
			System.out.println("method name: "+m.getName());
			for(Annotation anno:m.getAnnotations()){
				System.out.println(anno);
			}
		}
		
	}

}
