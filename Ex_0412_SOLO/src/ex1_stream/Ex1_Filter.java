package ex1_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1_Filter {
	public static void main(String[] args) {
		
		/*
		 filter() : filter메서드는 주어진 조건을 만족하는 요소들로 구성된 스트림을 반환,
					스트림에서 원하는 요소만을 추출하여 새로운 스트림을 생성하는 역할을 한다.
					filter() 메서드는 스트림의 각 요소에 대해 조건을 적용하고,
					조건을 만족하는 요소만을 결과 스트림에 포함시킨다.
		 */
		
		//1 ~ 10까지의 숫자가 담긴 정수형 리스트 작성
		List<Integer> numbers = new ArrayList<Integer>();
		for( int i = 1; i < 11; i++ ) {
			numbers.add(i);
		}
		
		
		//numbers의 정수 중 짝수만을 포함하는 리스트를 evenNumbers에 저장 및 출력하기. 
		//stream()함수를 사용하여 스트림을 생성, 
		//filter()함수를 호출하여 짝수 요소들만 추출,
		//collect()함수를 사용하여 추출된 요소들을 리스트로 변환,
		
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
	}//main
}
