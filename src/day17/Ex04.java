package day17;

import java.util.ArrayList;
import java.util.HashMap;

class Test{
	private String test;
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest() {
		return test;
	}
	public void display() {
		System.out.println("test 기능 입니다");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		ArrayList<Test> tArr = new ArrayList<Test>();
		Test t = new Test();
		t.setTest("문자열");
		tArr.add(t);
		
		Test a = tArr.get(0);
		
		HashMap<String, Test> map = new HashMap<String, Test>();
		map.put("111", t);
		
	}
}
