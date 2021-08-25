package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList();
		arr.add("test");	//오브젝트 타입으로 받아주기 때문에 모든 타입을 넣을 수 있다
		arr.get(0); 		//타입을 지정해주면 get값도 오브젝트가 아닌 내가 지정한 타입으로 값을 돌려준다는 장점도 있다
		
		//double s = arr.get(3) + 1.111;
		//모든값을 규칙없이 넣을 시, 저장한 값이 많아지면 어떤 타입인지 알 수 없어서 사용할때 불편함이 생긴다(연산에러)
		
		String s = arr.get(0) + "문자열 연산입니다";
		
	}
}
