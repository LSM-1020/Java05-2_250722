package java5_2;

public class EnumTest03 {

	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Season nowTime = Season.SUMMER;
		
		switch (nowTime) {
		case SPRING:
			System.out.println("봄입니다.");
			break;
		case SUMMER:
			System.out.println("여름입니다.");
			break;
		case FALL:
			System.out.println("가을입니다.");
			break;
		case WINTER:
			System.out.println("겨울입니다.");
			break;
		}
	}

}
