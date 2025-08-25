package lab2;

public class Car {
	private String brand;
	private String model;
	private double price;
	private double mileage;
	private String ownerName;
	
	private static int totalCar;
	private static String showRoomName="Abccars";
	
	public Car(String b,String m,double p,double mil) {
		this.brand=b;
		this.model=m;
		this.price=p;
		this.mileage=mileage;
		ownerName="not assigned";
		totalCar++;
	}
	public Car(String b,String m,double p,double mil,String owner) {
		this.brand=b;
		this.model=m;
		this.price=p;
		this.mileage=mileage;
		ownerName=owner;
		totalCar++;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void displayDetails() {
		System.out.println("Brand:" +brand);
		System.out.println("Model:" +model);
		System.out.println("Price:" +price);
		System.out.println("Mileage:" +mileage);
		System.out.println("Ownername:" +ownerName);
		System.out.println("------------");
	}
	public void updatePrice(double newPrice) {
		price=newPrice;
	}
	public static void showTotalCars() {
		System.out.println("Total cars:" +totalCar);
	}
	public static void showshowRoom() {
		System.out.println("Showroom name:" +showRoomName);
	}

}
