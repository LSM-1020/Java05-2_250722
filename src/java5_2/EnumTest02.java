package java5_2;

public class EnumTest02 {

	enum Day {
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day today = Day.TUESDAY;
			System.out.println("오늘은" + today);
	}

}
