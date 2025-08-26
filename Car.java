package lab2;

public class Car {
	private String  brand;
	private  String  model;
	private double  mileage;
	private double  price;
	private String ownername; 
	private static int totalCars; 
	private static String showroomName="City Motors";
	public Car(String b, String m, double  p,double mil)
	
	{
	brand=b;
	model=m;
	price=p;
	mileage=mil;
	this.ownername="Hardik";
	totalCars++;
	}
	public Car(String b, String m ,double p,double mil,String owner) {

	brand=b;
	model=m;
	price=p;
	mileage=mil;
	this.ownername=owner;
	totalCars++;
	}
	public String getOwnerName() {
		return ownername;
	}
	 public void setOwnerName(String owner) {
	        this.ownername = ownername;
	 }
	   public void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	        System.out.println("Mileage: " + mileage);
	        System.out.println("Owner: " +ownername);
	    }
	
	   public void updatePrice(double newPrice) {
	        price = newPrice;
	        
	
}

	   public static void showTotalCars() {
	        System.out.println("Total Cars: " + totalCars);
	    }

	    public static void showShowroomName() {
	        System.out.println("Showroom: " + showroomName);
	    }
	}

	
