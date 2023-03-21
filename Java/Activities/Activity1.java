package Activities;

public class Activity1 {

	public static void main(String[] args) {
		car toyota = new car();
		toyota.make = 2014;
		toyota.color = "Black";
		toyota.tranmission = "Manual";

		toyota.displayCharacteristics();
		toyota.accelarate();
		toyota.brake();
	}

}
