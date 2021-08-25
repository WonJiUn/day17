package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01_Arr1 {
	public static void main(String[] args) {
		
		boolean flag = true;
		int num;
		String id;
		String name;
		String addr;
		int phNum;
		
		Scanner input = new Scanner(System.in);
		ArrayList<Quiz01_StInfo> arr = new ArrayList<Quiz01_StInfo>();
		Quiz01_StInfo st = new Quiz01_StInfo();
		
		while(flag) {	
			System.out.println("1. 회원등록");
			System.out.println("2. 회원찾기");
			System.out.println("3. 모든회원정보");
			System.out.println("4. 회원탈퇴");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1:
				Quiz01_StInfo s = new Quiz01_StInfo();
				while(true) {
					System.out.print("ID입력 : ");
					id = input.next();
					if(arr.size() !=0) {
						int i;
						for(i = 0; i<arr.size();i++) {
							if(arr.get(i).getId().equals(id)) {
								System.out.println("이미 존재하는 아이디입니다");
								break;
							}
						}
						if(i != arr.size()) {
							continue;
						}
					}
					break;
				}
				System.out.print("이름입력 : ");
				name = input.next();
				System.out.print("주소입력 : ");
				addr = input.next();
				System.out.print("전화번호입력 : ");
				phNum = input.nextInt();
					
				s.setId(id); s.setName(name); s.setAddr(addr); s.setPhNum(phNum);
				
				arr.add(s);
				
				System.out.println("등록되었습니다");
				break;
			case 2:
				
				System.out.println("총 회원수 : " + arr.size());
				System.out.print("찾을 아이디 : ");
				id = input.next();
				
				for(int i = 0; i<arr.size();i++) {
					Quiz01_StInfo ss = arr.get(i);
				
					if(ss.getId().indexOf(id) != -1) {
						
						System.out.println("ID : " + ss.getId());
						System.out.println("이름 : " + ss.getName());
						System.out.println("주소 : " + ss.getAddr());
						System.out.println("전화번호 : " + ss.getPhNum());
					}
				}
				break;
			case 3:
				for(int i = 0; i<arr.size(); i++) {
					Quiz01_StInfo sss = arr.get(i);
					System.out.println("ID : " + sss.getId());
					System.out.println("이름 : " + sss.getName());
					System.out.println("주소 : " + sss.getAddr());
					System.out.println("전화번호 : " + sss.getPhNum());
					System.out.println("---------------------");
				}
				break;
			case 4:
				System.out.println("총 회원수 : " + arr.size());
				System.out.print("탈퇴할 아이디 : ");
				id = input.next();
				for(int i = 0; i<arr.size();i++) {
					Quiz01_StInfo ssss = arr.get(i);
				
					if(ssss.getId().indexOf(id) != -1) {
						System.out.println(ssss.getId() + "가 탈퇴되었습니다");
						arr.remove(i);
					}
				}
				break;
			case 5: 
				System.out.println("종료합니다");
				flag = false;
					
			}
		}
		
		
		
		
		
			
	
	}
}