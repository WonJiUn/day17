package day17;
//<T> : 제네릭. 자료형을 가변적으로 부여
class Print02<T>{
	public void test(T n1, T n2) {
		System.out.println(n1 + "," + n2);
		System.out.println(n1.getClass());	//래퍼클래스가 적용이됨을 알수있음
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Print02<Double> dou = new Print02();
		dou.test(1.11, 2.222);
		Print02<String> str = new Print02();
		str.test("aa", "bb");
		Print02<Integer> in = new Print02();
		in.test(10, 20);
		
		//<>안에는 클래스 자료형만 들어갈 수 있다(첫글자가 대문자인 래퍼 클래스)
		
	}
	
}
