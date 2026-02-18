package Polymorphism;

class Demo1 {

	void fun(int x, float y) {
		System.out.println("Integer-Float parameter");
	}
	void fun(float x, int y) {
		System.out.println("Float-Integer parameter");
	}
}

class OverloadingDemo1{
	
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		obj.fun(10, 10.5f);
		obj.fun(20.5f, 20);
	}
}