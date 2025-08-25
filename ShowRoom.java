package lab2;

public class ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Toyoto","Corolla",16000,18.5);
		Car c2=new Car("Honda","civic",20000,16.5,"jhon");
		Car c3=new Car("Hyundai","i04",30000,13.5);
		
		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();
		
		c1.setOwnerName("deep");
		c1.updatePrice(17000);
		
		System.out.println("After updates:");
		c1.displayDetails();
		
		Car.showshowRoom();
		Car.showTotalCars();

	}

}
