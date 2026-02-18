package Polymorphism;

public class OverloadingDemo {

	void fun(int x) {
		System.out.println(x);
	}
	void fun(float y) {
		System.out.println(y);
	}
	void fun(OverloadingDemo obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		OverloadingDemo obj = new OverloadingDemo();
		obj.fun(10);
		obj.fun(15.8f);
		obj.fun(obj);
		
		OverloadingDemo obj1 = new OverloadingDemo();
		obj1.fun(obj);
		obj1.fun(obj1);
	}
}
