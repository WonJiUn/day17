package day17;

import java.util.Scanner;

public class Quiz01_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		Quiz01_Map map = new Quiz01_Map();
		//Quiz01_Arr1 arr = new Quiz01_Arr1();
		Quiz01_Arr arr = new Quiz01_Arr();
		
		System.out.println("1. Arr 회원관리");
		System.out.println("2. Map 회원관리");
		System.out.print(">>> ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			//arr.main(args);
			arr.display();
			break;
		case 2:
			map.display();
			break;
		}
		
	}
}
