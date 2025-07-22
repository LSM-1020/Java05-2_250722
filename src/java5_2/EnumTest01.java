package java5_2;

public class EnumTest01 {

	enum Gender {
		MALE, FEMALE 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender g = Gender.FEMALE; // g는 열거한 Gender male과 female중 female로 세팅됨
		
		if(g == Gender.MALE) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		
	}

}
