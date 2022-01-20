package AnnotationsExamples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface TypeAnno{}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen{}

@Target(ElementType.TYPE_USE)
@interface Unique{}

@Target(ElementType.TYPE_USE)
@interface MaxLen{
	int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What1{
	int description();
}

@Target(ElementType.FIELD)
@interface EmptyOk{}

@Target(ElementType.METHOD)
@interface Recommended{}

public class _4_TypeAnnotations {
	
	
	public @Unique _4_TypeAnnotations(){
		System.out.println("This is Contructor");
	}
	
	@TypeAnno String str;
	
	@EmptyOk String test;
	
	public int f(@TypeAnno _4_TypeAnnotations this, int x) {
		return 10;
	}
	
	public @TypeAnno Integer f2(int j, int k) {
		return j+k;
	}
	
	public @Recommended Integer f3(String str) {
		return str.length()/2;
	}
	
	public void f4() throws @TypeAnno NullPointerException{
		
	}
	
	String @MaxLen(10)[]  w;
	
	public static void myMeth(int i) {
		_4_TypeAnnotations ob=new _4_TypeAnnotations();
		@Unique _4_TypeAnnotations ob2= new _4_TypeAnnotations();
		
		System.out.println("Method f result of object ob in int: "+ob.f(i));
		System.out.println("Method f result of object ob2 in int: "+ob2.f(i));
		
		System.out.println("Method f2 result of object ob in int: "+ob.f2(i,i));
		System.out.println("Method f2 result of object ob2 in int: "+ob2.f2(i,i));
		
		System.out.println("Method f3 result of object ob in int: "+ob.f3("ob f3"));
		System.out.println("Method f3 result of object ob2 in int: "+ob2.f3("ob2 f3"));
		
		System.out.println("Max length greater than 10: "+ob.w);
		System.out.println("Method f3 result of object ob2 in int: "+ob2.f3("ob2 f3"));
		
		Object x=new Integer(10);
		Integer y;
		y=(@TypeAnno Integer) x;
	}
	
	public static void main(String[] args) {
		myMeth(10);
	}
	
}

