package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("고순조", Member.MALE, 29),
				new Member("호구영", Member.FEMALE, 20),
				new Member("황서뱀", Member.FEMALE, 30),
				new Member("박구두", Member.MALE, 25)
				);
		//전체 평균 나이
		double avg = list.stream().mapToInt(Member::getAge).average().orElse(0);
		System.out.println(avg);
		//남자 평균
		double avg1 = list.stream()
				.filter(x->x.getSex() == Member.MALE)
				.mapToInt(Member::getAge)
				.average().orElse(0);
		System.out.println(avg1);
	}

}
