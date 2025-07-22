package java5_1_250722;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kor";
		String str2 = "kor"; 
		// 기존 문자열이 존재하는지 검색후에 똑같은 문자열이 존재하면 같은주소를 참조하는 방식으로 생성
		String str3 = new String ("kor"); //무조건 메모리에 새로 문자열을 생성
		//문자열 변수는 참조타입이므로, 해당 조건식은 str1과 str2의 값을 비교하는것이 아니라
		//str1과 str2가 가지고있는 실제 문자열에 저장되어있는 메모리 번지를 비교하는 것이다
		if(str1 == str3) { //문자열 비교는 == 사용안됨!!
			System.out.println("같다");
		}else {
			System.out.println("다르다");
	}
		if(str2.equals(str3)) { //문자열 비교는 equals를 씀!!
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(str1 == str2) { //문자열 비교는 == 사용안됨!!
			System.out.println("같다");
		}else {
			System.out.println("다르다");
	    }
		System.out.println("String 해시 코드:" + System.identityHashCode(str1));
		System.out.println("String 해시 코드:" + System.identityHashCode(str2));
		System.out.println("String 해시 코드:" + System.identityHashCode(str3));
		//hashcode확인시 str1과 str2는 메모리를 아끼기 위해 시스템상 같은코드 배정, str3는 문자열은 같으나
		//실제 번지는 다른것을 확인
		
	}	
}
