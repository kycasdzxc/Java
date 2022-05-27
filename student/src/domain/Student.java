package domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

// VO : Value Object : 값을 저장할 목적의 객체
// source generate
@Getter
@Setter

public class Student implements Serializable {

	// 필드 : 학번, 이름, 국어, 영어, 수학	
	private String no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	// 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String no, String name) {
		this(no, name, getScore(), getScore(), getScore());
	}

	public Student(String no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 총점, 평균
	public int sum () {
		return kor + eng + mat;
	}
	
	public double avg () {
		return (int)(sum() / 3d * 100) / 100d;
	}
	
//	점수 랜덤
	private static int getScore() {
		return (int) (Math.random() * 41) + 60; // 국어, 영어, 수학 점수 랜덤 출력
	}

//	toString 정의
	public String toString() {
		return String.format(" %5s%5s \t %3d \t %3d \t %3d \t %3d \t %2.2f",
							no, name, kor, eng, mat, sum(), avg());
	}
}