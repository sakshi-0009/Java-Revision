package Polymorphism;

class Superclass{
	
	int x = 10;
	static float y = 10.5f;
	Superclass(){
		System.out.println("In parent constructor");
	}
}

class Subclass extends Superclass{
	
	int x = 100;
	static int y = 200;
	
	Subclass(){
		System.out.println("In child constructor");
	}
	
	void access() {
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.x);
		System.out.println(this.y);
	}
}

class Demo {

	public static void main(String[] args) {
		Subclass obj = new Subclass();
		obj.access();
	}
}
