package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01_Map {
	private HashMap<String, Quiz01_StInfo> map;
	private Scanner sc;
	
	public Quiz01_Map(){
		sc = new Scanner(System.in);
		map = new HashMap<String, Quiz01_StInfo>();
	}
	
	public void display() {
		System.out.println("Map 회원관리 연결");
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
		
		if(map.size() != 0) {
			while(true) {
				System.out.print("ID 입력 : ");
				id = sc.next();
				if(map.containsKey(id)) {
					System.err.println("중복된 아이디입니다!!!");
					continue;
				}
				break;
			}
		} else {
			System.out.print("ID 입력 : ");
			id = sc.next();
		}
			
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("주소 입력 : ");
		addr = sc.next();
		System.out.print("전화번호 입력 : ");
		phNum = sc.nextInt();
		
		s.setId(id); s.setName(name); s.setAddr(addr); s.setPhNum(phNum);
		map.put(id, s);
		System.out.println("등록되었습니다");
		
	}
	
	public void members() {
		if(map.size() != 0) {
			Iterator<String> it = map.keySet().iterator();
			System.out.println("전체 회원수 : " + map.size());
			while(it.hasNext()) {
				Quiz01_StInfo s = map.get(it.next());
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
		
		if(map.containsKey(id)) {
			Quiz01_StInfo s = map.get(id);
			System.out.println("ID : " + s.getId());
			System.out.println("이름 : " + s.getName());
			System.out.println("주소 : " + s.getAddr());
			System.out.println("전화번호 : " + s.getPhNum());
		}
		else {
			System.err.println("ID를 찾을 수 없습니다!!!");
		}
	}
	
	public void remove() {
		String id;
		System.out.print("탈퇴할 ID 입력 : ");
		id = sc.next();
		
		if(map.containsKey(id)) {
			System.out.println("이름 : " + map.get(id).getName());
			map.remove(id);
			System.out.println("탈퇴되었습니다");
			
		}else {
			System.err.println("그런 회원은 없습니다!!!");
		}
	}
	
}
