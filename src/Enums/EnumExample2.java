package Enums;

public class EnumExample2 {

	enum mobile {
		APPLE, SAMSUNG, HTC, ONEPLUS;
	}

	mobile m;

	EnumExample2(mobile mob) {
		this.m = mob;
	}

	public void CompDetails() {
		switch (m) {
		case APPLE:
			System.out.println("This is APPLE COMPANY");
			break;
		case SAMSUNG:
			System.out.println("This is SAMSUNG COMPANY");
			break;
		case HTC:
			System.out.println("This is HTC COMPANY");
			break;
		case ONEPLUS:
			System.out.println("This is ONEPLUS COMPANY");
			break;
		default:
			System.out.println("Invalid Mobile Company");
			break;
		}

	}

	public static void main(String[] args) {
		EnumExample2 m1 = new EnumExample2(mobile.APPLE);
		m1.CompDetails();
	}

}
