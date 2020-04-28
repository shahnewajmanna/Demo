package HW;

public class Mobile {
	double ios;
	int price;
	
	public Mobile(String ios, String Price) {
		this.ios = 10.5;
		this.price = 1000;
		
		System.out.println("This Phone has ios " + this.ios + " and the price is " + this.price);
	}
	public void actprice(int a, int b) {
		int price = 1000;
		int sale = 140;
		int actprice = price - sale;
		
		System.out.println("Total price after sale is " + actprice );
	}

	public static void main(String[] args) {
		
		Mobile obj = new Mobile("1000", "10.5");
		obj.actprice(1000,140);
		

		double ios = 10.5;
		if (ios >= 10.5)   {
			System.out.println("This is Iphone 11");
		}else { 
			System.out.println("This is an old Phone");
		}
		
		for (int i = 3; i <=6; i++) {
			System.out.println(" Sale going on");
			for (int j = 2; j <=4; j++);
			System.out.println("For limited time");
		}
	}


}
