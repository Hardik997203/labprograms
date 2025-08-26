package lab2;

public class Showroom {
	public static void main(String[] args) {
	Car c1 = new Car("toyota", "fjcruiser", 15000, 18.5);
    Car c2 = new Car("tata", "curv", 20000, 16.0, "carlo");
    Car c3 = new Car("Hyundai", "i20", 12000, 20.0);

    c1.displayDetails();
    c2.displayDetails();
    c3.displayDetails();

    c1.setOwnerName("Hardik");  
    c1.updatePrice(16000);

    System.out.println("After Updates:");
    c1.displayDetails();

    Car.showShowroomName();
    Car.showTotalCars();
	}
}


