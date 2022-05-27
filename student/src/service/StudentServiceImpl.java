package service;

import static utils.StudentUtil.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import app.Test;
import domain.Student;

// 01/17 Student 필드 정의, main 메서드 메뉴 정리
// 01/18 생성자 정의, 조회기능, 등록기능 구현
// 01/19 toString 정의, 수정기능 구현
// 01/20 Scanner에서 자주 사용되는 기능 모듈화, package 분리,
//		 모든 필드에 private 적용(getter/setter 제작 사용), 삭제 기능 구현
// Student : domain에 존재
// StudentEx : app에 존재
// StudentService : service에 존재
// StudentUtil : utils에 존재

// Object(this)toString 

// 기능 담당
@SuppressWarnings("unchecked")
public class StudentServiceImpl implements StudentService {
//	Student[] students = new Student[10]; // 학생들
	List<Student> students = new ArrayList<Student>();
	
	{
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
			students = (List<Student>) ois.readObject();
			System.out.println("파일 불러오기 완료");
			ois.close();
			
		} catch (FileNotFoundException e) {
			String[] names = { "김경보", "김동엽", "김상현", "김승종", "김예찬", "김경보", "김태윤" };

			for (int i = 0; i < names.length; i++) {
							students.add(new Student(22000 + i + 1 + "", names[i]));
				}
				System.out.println("임시 데이터 초기화 완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0); // vo에 하나 추가해버렸을 때 시스템 종료
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 1. 조회하기
	public void list() { // 조회 기능 구현
		System.out.println("조회 기능 구현");
//		System.out.printf(" 학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 %n");
		System.out.println(String.format("%s%s%s%s%s%s%s"
									, Test.convert("학번", 8)
									, Test.convert("이름", 10)
									, Test.convert("국어", 5)
									, Test.convert("영어", 5)
									, Test.convert("수학", 5)
									, Test.convert("총점", 5)
									, Test.convert("평균", 9)));
		System.out.printf("===================================================%n");

		for (Student s : students) {
			System.out.print(Test.convert(s.getNo(), 8));
			System.out.print(Test.convert(s.getName(), 10));
			System.out.print(Test.convert(s.getKor()+"", 5));
			System.out.print(Test.convert(s.getEng()+"", 5));
			System.out.print(Test.convert(s.getMat()+"", 5));
			System.out.print(Test.convert(s.sum()+"", 5));
			System.out.print(Test.convert(s.avg()+"", 9));
			System.out.println();
		}
	}
	// 2. 등록하기
	public void register() { // 등록 기능 구현
		System.out.println("등록 기능 구현");

		// 한 줄로 변경
		students.add(new Student(nextLine("학번 >"), nextLine("이름 >", true),
								nextInt("국어 >"), nextInt("영어 >"), nextInt("수학 >")));
		
		System.out.println("정상 등록 되었습니다.");
		save();
	}
	// 3. 수정하기
	public void modify() { // 수정 기능 구현
		System.out.println("수정 기능 구현");
		
		// 학번으로 학생을 탐색 후 학생 데이터 중 이름, 국어, 영어, 수학점수를 수정
		Student student = findBy(nextLine("수정할 학생의 학번 >"));
		if (student == null) {
			System.out.println("존재하지 않는 학번입니다");
			return;
		}
		student.setName(nextLine("이름 >", true));
		
		student.setKor(nextInt("국어 >"));
		student.setEng(nextInt("영어 >"));
		student.setMat(nextInt("수학 >"));
		
		System.out.println("수정 완료 되었습니다.");
		save();
	}
	// 4. 삭제하기
	public void remove() {
		System.out.println("삭제 기능 구현");
		students.remove(findIndexBy(nextLine("삭제할 학생의 학번 >")));
		
		System.out.println("삭제 완료 되었습니다.");
		save();
	
	}
	private Student findBy (String no) {
		Student student = null;
		for (Student s : students) {
			if (s.getNo().equals(no)) {
				student = s;
			}
		}
		return student;
	}
	
	private int findIndexBy (String no) {
		int ret = -1;
		for (int i = 0; i < students.size(); i++) {	
			if (students.get(i).getNo().equals(no)) {
				ret = i;
				break;
			}
		}
		return ret;
	}

	private void save() {
		ObjectOutputStream oos;
		try {
		oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
		oos.writeObject(students);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}