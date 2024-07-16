package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cat {
	private String breed; // 품종
	private String color;
	private int age;
	
	//생성자
//	public Cat(String breed) {
////		super();  //this()
////		this.breed = breed;
//		this(breed, "흰색", 10); //생성자를 만들자 마자 바로 호출
//	}
//
//	public Cat(String breed, String color) {
////		super();
////		this.breed = breed;
////		this.color = color;
//		this(breed, color, 10);
//	}
//
//	public Cat(String breed, String color, int age) {
////		super();// 부모의 생성자
//		this.breed = breed;
//		this.color = color;
//		if(age > 9) {
//			this.age = age;
//		}
//	}
//
	Cat() { //생성자는 리턴타입을 쓰지 못함, 기본 생성자
		System.out.println("Cat()");
	}
	
	Cat(int age){ // 생성자
	}
}
