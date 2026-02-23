package Polymorphism;

class Parent1{
	
	Parent1(){
		System.out.println("In Parent Constructor");
	}
	void fun(int x) {
		System.out.println("In Parent fun method");
	}
}

class Child1 extends Parent1{
	
	Child1(){
		System.out.println("In Child Constructor");
	}
	void fun(int x) {
		System.out.println("In Child fun method");
	}
}

class OverridingDemo1 {

	public static void main(String[] args) {
		Parent1 obj = new Child1();
		obj.fun(10);
	}
}
