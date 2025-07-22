package java5_1_250722;

import java.util.Arrays;

public class ReffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = null;
		int[] numArr2 = {1,2,3,4,5};
		numArr1 = numArr2;
		// 참조된 주소만 복사되고 메모리에서 2개가 생긴것은 아님 = 얕은복사
		numArr2[2] = 300;
		System.out.println(numArr1[2]);
		
		System.out.println("String1 해시 코드:" + System.identityHashCode(numArr1));
		System.out.println("String2 해시 코드:" + System.identityHashCode(numArr2));
		
		int[] numArr3 = null;
		int[] numArr4 = {100,200,300};
		numArr3 = Arrays.copyOf(numArr4, 3); //(원본,배열길이)
		// numArr4가 메모리에 한개 더 생성되어서 numArr3는 그걸 지칭함 = 깊은복사
		
		numArr4[2] = 800;
		System.out.println(numArr3[2]);
		System.out.println(numArr4[2]);
		//Arr1,2와 다르게 메모리에 복사가 되어 값을 바꿔도 전부 바뀌지 않음
		
		for(int num:numArr3) {
			System.out.println(num);
		}
		System.out.println("String3 해시 코드:" + System.identityHashCode(numArr3));
		System.out.println("String4 해시 코드:" + System.identityHashCode(numArr4));
		
		}
	

}
