package Inheritance;


class SupremeCourt{
	
	SupremeCourt(){
		System.out.println(this);
		System.out.println("In Supreme Court constructor");
	}
	void Court(){
		System.out.println("Supreme Court of India");
	}
}

class HighCourt extends SupremeCourt{
	
	HighCourt(){
		System.out.println(this);
		System.out.println("In High Court constructor");
	}
}
class Client {

	public static void main(String[] args) {
		SupremeCourt obj = new SupremeCourt();
		HighCourt obj1 = new HighCourt();
		
		obj.Court();
		obj1.Court();
	}
}
