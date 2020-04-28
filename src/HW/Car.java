package HW;

public class Car {
	
	int time;
	 int mph;
	 int distance;
	private int price;
	private String make;
	private String model;
	
	public Car(String Honda, String Accord) {
		
		this.make = Honda;
		this.model = Accord;
		System.out.println("Car make is " + this.make +" and car model is " +this.model);
		
		
	}
	
	
	public void distance () {
		mph = 80;
		time = 3;
		distance = mph / time;
		
		System.out.println("This car will cover " + distance +" mile");
	}
	
	
	
	public Car(String price) {
		
		
		Car obj = new Car(price);
		obj.price = 30000;
		
System.out.println(obj.price);
		
	}



	public static void main(String[] args) {
	
		Car obj = new Car("Honda", "Accord");
	   obj.distance();
		
	   
	  
	   
    double engine = 3.5; 
	if (engine >= 3.5) {
		System.out.println("This is a fast Car");
		} else {
			System.out.println("This is not a fast Car");
		}
	
	for (int i = 1; i <6; i++) {
		System.out.println("This is a car everyone want");
		for (int j = 3; j <=7; j++);
		System.out.println("You should buy it");
	}
	
	
		
	
	}
	
}