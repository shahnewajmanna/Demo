package HW;

public class Computer {
	
	private String a;
	private String b;
	
	
	Computer(String Mac, String Windows) {
		this.a = Mac;
		this.b = Windows;
		System.out.println("Do you like the " + this.a + " or you want  " + this.b);
		
	}
	
	 public void produce() {
		 int USA = 3500;
		 int World = 500000;
		 int produce = USA + World;
		 System.out.println("Total production in a day is " + produce);
	 }
	

	public static void main(String[] args) {
		
		
		Computer obj = new Computer("Mac", "windows"); 
		obj.produce();
		
		
	int price = 2700;
	if (price >= 256) {
		System.out.println("This is 16gb and core i7");
	}else {
		System.out.println("This is not the one");
	}
	
	for (int i = 1; i <3; i++) {
		System.out.println("Computer is very important device ");
		for (int j = 1; j <3; j++) {
			System.out.println("It make life easier");
	}
}
	}
}
