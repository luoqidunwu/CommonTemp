package net.com.common;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 class EnumTest{
	 private final String name;
	 private static int ind=0;
	 private final int order;
	 
	 private EnumTest(String name) {
		 this.name=name;
		 this.order=ind++;
	 }
	 public static final EnumTest APPLE=new EnumTest("apple");
	 public static final EnumTest ORANGE=new EnumTest("orange");
	 private static final EnumTest[] PRIVATE_VALUE={APPLE,ORANGE};
	 //public static final List<EnumTest> va=Collections.unmodifiableList(Arrays.asList(va));
 }

class Person{
	int age;
	String name;
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	private Person(){
		this.age=12;
		this.name="Hello";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static <T> T[] getInfo(T ... ss){
		return ss;
	}
}

class Point<T>{
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}
public class Test_001 {
	public static void main(String[] args) {
		int a=10,b=11;
		System.out.println((int)Math.ceil((double)a/b));
		for(int i=0; i<9999; i++){
			double d = i;
			if(i != d) System.out.println(i);
		}
	}
}
