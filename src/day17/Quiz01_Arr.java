package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_Arr {
	private ArrayList<Quiz01_StInfo> arr;
	private Scanner sc;
	
	public Quiz01_Arr() {
		sc = new Scanner(System.in);
		arr = new ArrayList<Quiz01_StInfo>();
	}
	
	public void display() {
		System.out.println("Arr 회원관리 연결");
		int num;
		while(true) {
			System.out.println("1.등록 2.전체회원 3.회원검색 4.회원탈퇴 5.종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("회원등록");
				register();
				break;
			case 2:
				System.out.println("전체회원보기");
				members();
				break;
			case 3:
				System.out.println("회원검색");
				search();
				break;
			case 4:
				System.out.println("회원탈퇴");
				remove();
				break;
			case 5:
				System.out.println("종료합니다");
				return;
			}
		}
	}
	public void register() {
		Quiz01_StInfo s = new Quiz01_StInfo();
		String id, name, addr;
		int phNum;
		
		if(arr.size() != 0) {
			while(true) {
				System.out.print("ID입력 : ");
				id = sc.next();
				int i;
				for(i = 0; i<arr.size(); i++) {
					if(id.equals(arr.get(i).getId())) {
						System.err.println("이미 존재하는 ID입니다!!!");
						break;
					}
				}
				if(i != arr.size()) {
					continue;
				}
				break;
			}
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("주소 입력 : ");
			addr = sc.next();
			System.out.print("전화번호 입력 : ");
			phNum = sc.nextInt();
			
			
		}else {
			System.out.print("ID입력 : ");
			id = sc.next();
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("주소 입력 : ");
			addr = sc.next();
			System.out.print("전화번호 입력 : ");
			phNum = sc.nextInt();
		}
		s.setId(id); s.setName(name); s.setAddr(addr); s.setPhNum(phNum);
		arr.add(s);
		System.out.println("등록되었습니다");
		
	}
	
	public void members() {
		if(arr.size() != 0) {
			System.out.println("전체 회원수 : " + arr.size());
			for(int i = 0; i<arr.size(); i++) {
				Quiz01_StInfo s = arr.get(i);
				System.out.println("ID : " + s.getId());
				System.out.println("이름 : " + s.getName());
				System.out.println("주소 : " + s.getAddr());
				System.out.println("전화번호 : " + s.getPhNum());
				System.out.println("-------------------");
			}
		}else {
			System.err.println("저장 데이터가 없습니다!!!");
		}
	}
	
	public void search() {
		String id;
		System.out.print("찾을 ID 입력 : ");
		id = sc.next();
		int i;
		
		for(i = 0; i<arr.size(); i++) {
			Quiz01_StInfo s = arr.get(i);
			
			if(id.equals(arr.get(i).getId())) {
				System.out.println("ID : " + s.getId());
				System.out.println("이름 : " + s.getName());
				System.out.println("주소 : " + s.getAddr());
				System.out.println("전화번호 : " + s.getPhNum());
				break;
			}
			
		}
		if(i == arr.size()) {
			System.err.println("검색 결과가 없습니다!!!");
		}
	}
	
	public void remove() {
		String id;
		System.out.print("탈퇴할 ID 입력 : ");
		id = sc.next();
		
		int i;
		
		for(i = 0; i<arr.size(); i++) {
			Quiz01_StInfo s = arr.get(i);
			
			if(id.equals(arr.get(i).getId())) {
				arr.remove(i);
				System.out.println("탈퇴되었습니다");
				break;
			}
			
		}
		if(i == arr.size()) {
			System.err.println("그런 회원은 없습니다!!!");
		}
	}
	
	
}
