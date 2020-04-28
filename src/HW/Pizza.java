package HW;

public class Pizza {
	
	int price;
	int  Quantity;
	 
	public void total() {
		int price = 20;
		int Quantity = 3;
		int total = price * Quantity;
		System.out.println("The total is " + total);
		
	}
	
	

	public Pizza(String Quantity) {
	this.Quantity = 3;
		System.out.println("There should be " + this.Quantity + " Pizza");
	}
	
	
	



	public static void main(String[] args) {
		
			
		Pizza obj = new Pizza("20");
		obj.total();
	
          obj.price =20;
          System.out.println(obj.price);

	
int size = 18;
if (size >=18) {
	System.out.println("It is large");
} else {
	System.out.println("It is not large");
}


for (int i = 1; i <6; i++) {
	System.out.println("This is thin crust pizza ");
	for (int j = 3; j <=7; j++);
	System.out.println("with extra chess");
}
	}
	
	
}

